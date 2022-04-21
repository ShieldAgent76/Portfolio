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

package mouselisteners;

/*
 * MouseMotionEventDemo.java
 *
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *  A class that demonstrates MouseMotion Event.
 * 
 *  @author Oracle and/or its affiliates
 *  @author Charles Bryan
 *  @version Autumn 2015 (Edited only to match CheckStyle rules)
 */
public class MouseMotionEventDemo extends JPanel implements MouseMotionListener {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 8452917670991316606L;
    
    /** Saves the systems newline character. */
    private static final String NEWLINE = System.getProperty("line.separator");
    
    /** The default size of this JPanel. */
    private static final int WINDOW_SIZE = 650;
    
    /** The default border size. */
    private static final int BORDER_SIZE = 10;
    
    /** The default pane width. */
    private static final int PANE_WIDTH = 200;
    
    /** The default pane width. */
    private static final int PANE_HEIGHT = 75;
    
    /** The area for the mouse demonstration. */
    private final BlankArea myBlankArea;
    
    /** Where the output goes! */
    private final JTextArea myTextArea;
    
    /**
     * Constructs a MouseMotionEventDemo.
     */
    public MouseMotionEventDemo() {
        super(new GridLayout(0, 1));
        myBlankArea = new BlankArea(Color.YELLOW);
        myTextArea = new JTextArea();
        setUpComponents();
    }
    
    /**
     * Lay out the components.
     */
    public final void setUpComponents() {
        
        add(myBlankArea);

        myTextArea.setEditable(false);
        final JScrollPane scrollPane = new JScrollPane(myTextArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(PANE_WIDTH, PANE_HEIGHT));
        
        add(scrollPane);
        
        //Register for mouse events on blankArea.
        myBlankArea.addMouseMotionListener(this);
        
        //Register for mouse events on this panel.
        //addMouseMotionListener(this);
        
        setPreferredSize(new Dimension(WINDOW_SIZE, WINDOW_SIZE));
        setBorder(BorderFactory.createEmptyBorder(
                BORDER_SIZE, BORDER_SIZE, BORDER_SIZE, BORDER_SIZE));
       
    }
    
    /**
     * Helper method for when one of the demo MouseEvents happens. 
     * 
     * @param theEventDescription the description of what happened
     * @param theEvent the event object that called this method
     */
    private void eventOutput(final String theEventDescription, final MouseEvent theEvent) {
        myTextArea.append(theEventDescription
                + " (" + theEvent.getX() + "," + theEvent.getY() + ")"
                + " detected on "
                + theEvent.getComponent().getClass().getName()
                + NEWLINE);
        myTextArea.setCaretPosition(myTextArea.getDocument().getLength());
    }
    
    @Override
    public void mouseMoved(final MouseEvent theEvent) {
        eventOutput("Mouse moved", theEvent);
    }
    
    @Override
    public void mouseDragged(final MouseEvent theEvent) {
        eventOutput("Mouse dragged", theEvent);
    }
    
    /**
     * Creates a JFrame to demonstrate this panel.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        
        //Schedule a job for the event dispatch thread:
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
        final JFrame frame = new JFrame("MouseMotionEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        final JComponent newContentPane = new MouseMotionEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}