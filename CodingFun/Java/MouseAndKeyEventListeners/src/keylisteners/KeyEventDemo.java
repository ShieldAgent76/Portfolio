/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

package keylisteners;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *  A class that demonstrates KeyEvents.
 * 
 *  @author Oracle and/or its affiliates
 *  @author Charles Bryan
 *  @version Autumn 2015 (Edited only to match CheckStyle rules)
 */
public class KeyEventDemo extends JFrame implements KeyListener, ActionListener {

    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 1L;
    
    /** Saves the systems newline character. */
    private static final String NEWLINE = System.getProperty("line.separator");
    
    /** The default field size. */
    private static final int FIELD_SIZE = 10;
    
    /** The default width. */
    private static final int WIDTH = 375;
    
    /** The default width. */
    private static final int HEIGHT = 125;
    
    /** Where the output goes! */
    private final JTextArea myDisplayArea;
    
    /** The area where you type. */
    private final JTextField myTypingArea;

    /**
     * Constructs a KeyEventDemo.
     * @param theTitle the tile of this frame.
     */
    public KeyEventDemo(final String theTitle) {
        super(theTitle);
        myTypingArea = new JTextField(FIELD_SIZE);
        myDisplayArea = new JTextArea();
    }
    
    /**
     * Lay out the components.
     */
    private void setUpComponents() {
        
        final JButton button = new JButton("Clear");
        button.addActionListener(this);
        
        
        myTypingArea.addKeyListener(this);
        
        //Uncomment this if you wish to turn off focus
        //traversal.  The focus subsystem consumes
        //focus traversal keys, such as Tab and Shift Tab.
        //If you uncomment the following line of code, this
        //disables focus traversal and the Tab events will
        //become available to the key event listener.
        //typingArea.setFocusTraversalKeysEnabled(false);
        
        
        myDisplayArea.setEditable(false);
        final JScrollPane scrollPane = new JScrollPane(myDisplayArea);
        scrollPane.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        
        getContentPane().add(myTypingArea, BorderLayout.PAGE_START);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.PAGE_END);
    }    
    
    
    @Override
    public void keyTyped(final KeyEvent theEvent) { //is only generated if a valid Unicode character could be generated
        displayInfo(theEvent, "KEY TYPED: ");
    }
    
    @Override
    public void keyPressed(final KeyEvent theEvent) {//They are generated whenever a key is pressed, depends on keyboard, each key has virtual codes associated with them
        displayInfo(theEvent, "KEY PRESSED: ");
    }
    
    @Override
    public void keyReleased(final KeyEvent theEvent) {//They are generated whenever a key is released, depends on keyboard
        displayInfo(theEvent, "KEY RELEASED: ");
    }
    
    @Override
    public void actionPerformed(final ActionEvent theEvent) {
        //Clear the text components.
        myDisplayArea.setText("");
        myTypingArea.setText("");
        
        //Return the focus to the typing area.
        myTypingArea.requestFocusInWindow();
    }
    
    /**
     * Helper method for when one of the demo KeyEvents happens.
     * We have to jump through some hoops to avoid
     * trying to print non-printing characters
     * such as Shift.  (Not only do they not print,
     * but if you put them in a String, the characters
     * afterward won't show up in the text area.)
     * 
     * @param theEvent the event object 
     * @param theKeyStatus description of what happened
     */
    private void displayInfo(final KeyEvent theEvent, final String theKeyStatus) {
        
        //You should only rely on the key char if the event
        //is a key typed event.
        final int id = theEvent.getID();
        final String keyString;
        if (id == KeyEvent.KEY_TYPED) {
            final char c = theEvent.getKeyChar();
            keyString = "key character = '" + c + "'";
        } else {
            final int keyCode = theEvent.getKeyCode();
            keyString = "key code = " + keyCode
                    + " ("
                    + KeyEvent.getKeyText(keyCode)
                    + ')';
        }
        
        final int modifiersEx = theEvent.getModifiersEx(); //ALT+
        final StringBuilder modString = new StringBuilder(44);
        modString.append("extended modifiers = ");
        modString.append(modifiersEx);
        
        final String tmpString = KeyEvent.getModifiersExText(modifiersEx);
        modString.append('(');
        if (tmpString.length() > 0) {
            modString.append(tmpString);
        } else {
            modString.append("no extended modifiers");
        }
        modString.append(')');
        
        final StringBuilder actionString = new StringBuilder(); 
        actionString.append("action key? ");
        if (theEvent.isActionKey()) {
            actionString.append("YES");
        } else {
            actionString.append("NO");
        }
        
        final StringBuilder locationString = new StringBuilder(21);
        locationString.append("key location: ");
        final int location = theEvent.getKeyLocation();
        if (location == KeyEvent.KEY_LOCATION_STANDARD) {
            locationString.append("standard");
        } else if (location == KeyEvent.KEY_LOCATION_LEFT) {
            locationString.append("left");
        } else if (location == KeyEvent.KEY_LOCATION_RIGHT) {
            locationString.append("right");
        } else if (location == KeyEvent.KEY_LOCATION_NUMPAD) {
            locationString.append("numpad");
        } else { // (location == KeyEvent.KEY_LOCATION_UNKNOWN)
            locationString.append("unknown");
        }
        
        final char tab = '\t';
        
        myDisplayArea.append(theKeyStatus + NEWLINE
                + tab + keyString + NEWLINE
                + tab + modString + NEWLINE
                + tab + actionString + NEWLINE
                + tab + locationString + NEWLINE);
        myDisplayArea.setCaretPosition(myDisplayArea.getDocument().getLength());
    }
    
    /**
     * Creates a JFrame to demonstrate this panel.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        
        //Schedule a job for event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        final KeyEventDemo frame = new KeyEventDemo("KeyEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Set up the content pane.
        frame.setUpComponents();
        
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}