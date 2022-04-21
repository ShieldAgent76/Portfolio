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

package Menuandtoolbar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.MouseInputAdapter;

/**
 *  A class that demonstrates JToolBar.
 * 
 *  @author Oracle and/or its affiliates
 *  @author Charles Bryan
 *  @version Winter 2016 (Edited only to match CheckStyle rules)
 */
public class ToolBarExampleSimple extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = -9078734070358552669L;
    
    /** Saves the systems newline character. */
    private static final String NEWLINE = System.getProperty("line.separator");
    
    /** The default border size. */
    private static final int BORDER_SIZE = 20;
    
    /** The number of rows in the text area. */
    private static final int TEXT_AREA_ROWS = 15;
    
    /** The number of columns in the text area. */
    private static final int TEXT_AREA_COLS = 40;
    
    /** The area for the mouse demonstration. */
    private final BlankArea myBlankArea;
    
    /** Where the output goes! */
    private final JTextArea myTextArea;

    /**
     * Constructs a MouseEventDemo.
     */
    public ToolBarExampleSimple() {
        super(new BorderLayout());
        myBlankArea = new BlankArea(Color.YELLOW);
        myTextArea = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLS);
        setUpComponents();
    }
    
    /**
     * Lay out the components.
     */
    private void setUpComponents() {
        final JPanel innerPanel = new JPanel(new GridLayout(0, 1));
        innerPanel.add(myBlankArea);

        myTextArea.setEditable(false);
        final JScrollPane scrollPane = new JScrollPane(myTextArea);
        scrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        innerPanel.add(scrollPane);
        
        final MouseInputAdapter mia = new MyMouseInputAdapter();
        
        //Register for mouse events on blankArea and the panel.
        myBlankArea.addMouseListener(mia);
        myBlankArea.addMouseMotionListener(mia);
        innerPanel.addMouseListener(mia);
        innerPanel.addMouseMotionListener(mia);
        innerPanel.setBorder(BorderFactory.createEmptyBorder(
                 BORDER_SIZE, BORDER_SIZE, BORDER_SIZE, BORDER_SIZE));
        
        add(innerPanel, BorderLayout.CENTER);
        
        add(createToolBar(), BorderLayout.SOUTH);
        
    }
    
    /**
     * A helper method to make a ToolBar.
     * 
     * @return the example Tool Bar
     */
    private JToolBar createToolBar() {
        final JToolBar toolbar = new JToolBar();
        
        ImageIcon icon = new ImageIcon("./images/ic_walk.png");
        /*
         * Scale the image from 32x32 pixels down to 24x24 pixels.
         * https://docs.oracle.com/javase/8/docs/api/java/awt/Image.html
         */
        final Image smallImage = icon.getImage().getScaledInstance(
                                              24, -1, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(smallImage);
        
        final JButton button = new JButton(icon);
        toolbar.add(button);
        
        JToggleButton b;
        final ButtonGroup group = new ButtonGroup();
        b = new JToggleButton("Red");
        group.add(b);
        toolbar.add(b);
        b = new JToggleButton("Blue");
        group.add(b);
        toolbar.add(b);
        b = new JToggleButton("Green");
        group.add(b);
        toolbar.add(b);
        
        return toolbar;
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
        /* 
         * Use an appropriate Look and Feel 
         * https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         * 
         */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (final UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (final InstantiationException ex) {
            ex.printStackTrace();
        } catch (final ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
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
        final JComponent newContentPane = new ToolBarExampleSimple();
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
    }
}