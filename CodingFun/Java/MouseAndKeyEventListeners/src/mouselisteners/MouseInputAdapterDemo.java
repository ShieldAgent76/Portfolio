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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.event.MouseInputAdapter;

/**
 *  A class that demonstrates a MouseInputAdapter.
 * 
 *  @author Oracle and/or its affiliates
 *  @author Charles Bryan
 *  @version Autumn 2015 (Edited only to match CheckStyle rules)
 */
public class MouseInputAdapterDemo extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = -9078734070358552669L;
    
    /** Saves the systems newline character. */
    private static final String NEWLINE = System.getProperty("line.separator");
    
    /** The default size of this JPanel. */
    private static final int WINDOW_SIZE = 650;
    
    /** The default border size. */
    private static final int BORDER_SIZE = 20;
    
    /** The default pane width. */
    private static final int PANE_WIDTH = 200;
    
    /** The default pane width. */
    private static final int PANE_HEIGHT = 75;
    
    /** The area for the mouse demonstration. */
    private final BlankArea myBlankArea;
    
    /** Where the output goes! */
    private final JTextArea myTextArea;

    /**
     * Constructs a MouseEventDemo.
     */
    public MouseInputAdapterDemo() {
        super(new GridLayout(0, 1));
        myBlankArea = new BlankArea(Color.YELLOW);
        myTextArea = new JTextArea();
        setUpComponents();
    }
    
    /**
     * Lay out the components.
     */
    private void setUpComponents() {
        add(myBlankArea);

        myTextArea.setEditable(false);
        final JScrollPane scrollPane = new JScrollPane(myTextArea);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(PANE_WIDTH, PANE_HEIGHT));
        add(scrollPane);
        
        final MouseInputAdapter mia = new MyMouseInputAdapter();
        
        //Register for mouse events on blankArea. Don't for get to add it twice!
        myBlankArea.addMouseListener(mia);
        myBlankArea.addMouseMotionListener(mia);
        myBlankArea.addMouseWheelListener(mia);
        
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
        myTextArea.append(theEventDescription + " detected on "
                + theEvent.getComponent().getClass().getName()
                + "." + NEWLINE);
        myTextArea.setCaretPosition(myTextArea.getDocument().getLength());
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
     * event dispatch thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        final JFrame frame = new JFrame("MouseEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        final JComponent newContentPane = new MouseInputAdapterDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
    /**
     * A MouseInputAdapter implementation specific to this GUI.
     * 
     * @author Charles Bryan
     * @version Autumn 2015 
     *
     */
    class MyMouseInputAdapter extends MouseInputAdapter {
        
        //these methods are found in MouseListener
        @Override
        public void mousePressed(final MouseEvent theEvent) {
            eventOutput("Mouse pressed (# of clicks: "
                    + theEvent.getClickCount() + ')', theEvent);
        }
        
        @Override
        public void mouseReleased(final MouseEvent theEvent) {
            eventOutput("Mouse released (# of clicks: "
                    + theEvent.getClickCount() + ')', theEvent);
        }
        
        @Override
        public void mouseEntered(final MouseEvent theEvent) {
            eventOutput("Mouse entered", theEvent);
        }
        
        @Override
        public void mouseExited(final MouseEvent theEvent) {
            eventOutput("Mouse exited", theEvent);
        }
        
        @Override
        public void mouseClicked(final MouseEvent theEvent) {
            eventOutput("Mouse clicked (# of clicks: "
                    + theEvent.getClickCount() + ')', theEvent);
        }
        
        //These methods are found in MouseMotionListener
        @Override
        public void mouseMoved(final MouseEvent theEvent) {
            eventOutput("Mouse moved", theEvent);
        }
        
        @Override
        public void mouseDragged(final MouseEvent theEvent) {
            eventOutput("Mouse dragged", theEvent);
        }
        
        @Override
        public void mouseWheelMoved(final MouseWheelEvent theEvent) {
            eventOutput("Mouse wheel moved", theEvent);
        }
    }
}