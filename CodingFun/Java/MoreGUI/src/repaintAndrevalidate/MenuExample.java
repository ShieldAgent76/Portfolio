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

package repaintAndrevalidate;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.MouseInputAdapter;



/**
 *  A class that demonstrates MouseMotion Event.
 * 
 *  @author Oracle and/or its affiliates
 *  @author Charles Bryan
 *  @version Autumn 2015 
 */
public class MenuExample extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 8452917670991316606L; 
    
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
    
    /** CheckBox determining if logging is on or off. */
    private final JCheckBoxMenuItem myLogging;
    
    /**
     * Constructs a MouseMotionEventDemo.
     */
    public MenuExample() {
        super(new GridLayout(0, 1));
        
        //Instantiate these Components in the constructor but 
        //we will set the up and lay them out later. 
        myBlankArea = new BlankArea(Color.YELLOW);
        myTextArea = new JTextArea(TEXT_AREA_ROWS , TEXT_AREA_COLS);
        myLogging = new JCheckBoxMenuItem();
        
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
        
        add(scrollPane);
        
        final MouseInputAdapter mia = new MyMouseInputAdapter();
        //Register for mouse events on blankArea and panel.
        myBlankArea.addMouseListener(mia);
        myBlankArea.addMouseMotionListener(mia);
        addMouseListener(mia);
        addMouseMotionListener(mia);
        
        setBorder(BorderFactory.createEmptyBorder(
                BORDER_SIZE, BORDER_SIZE, BORDER_SIZE, BORDER_SIZE));
    }
    
    /**
     * Build the menu bar for this GUI. This method will need
     * to be called where access to a JFrame occurs. You attach
     * a MenuBar to a Frame, not a Panel. 
     * 
     * @param theFrame the containing JFrame of this menu bar
     * @return the menu bar for this GUI
     */
    private JMenuBar createMenu(final JFrame theFrame) {
        final JMenuBar menuBar = new JMenuBar();
         
        menuBar.add(buildFileMenu(theFrame));
        menuBar.add(buildColorButtonMenu());
        menuBar.add(buildLoggingMenu());
        
        return menuBar;
    }
    
    /**
     * Builds a menu with some options. 
     * 
     * @param theFrame the containing JFrame of this menu bar
     * @return a "file" menu with some menu items
     * https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html
     */
    private JMenu buildFileMenu(final JFrame theFrame) {
        final JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        
        menu.add(buildSubMenu());
        menu.addSeparator();
        
        /*
         * Scale the image from 32x32 pixels down to 12x12 pixels.
         * https://docs.oracle.com/javase/8/docs/api/java/awt/Image.html
         */
        ImageIcon icon = new ImageIcon("./images/ic_walk.png");
        final Image smallImage = icon.getImage().getScaledInstance(
                                              12, -1, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(smallImage);
        
        final JMenuItem exitItem = new JMenuItem("Exit", icon);
        exitItem.setMnemonic(KeyEvent.VK_X); //mnemonic selects a menu item using keyboard when the menu is visible, here it is the X key
                                             //accelerators are used to select menu items even if they are not visible e.g., ALT-X will choose exit
        exitItem.setAccelerator(KeyStroke.getKeyStroke(
                                                       KeyEvent.VK_X, ActionEvent.ALT_MASK));
        exitItem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                 
                 theFrame.getJMenuBar().add(new JMenu("Hi"));
             theFrame.revalidate();
            theFrame.repaint();

               // theFrame.dispatchEvent(new WindowEvent(theFrame, WindowEvent.WINDOW_CLOSING));
            }
        });
        
        menu.add(exitItem);
        
        return menu;
    }
    
    /**
     * Builds a menu to demonstrate sub menus. 
     * @return a menu with several simple menu items. 
     */
    private JMenu buildSubMenu() {
        final JMenu subMenu = new JMenu("Subs!");
        
        subMenu.add(buildSimpleMenuItem("Hello"));
        subMenu.add(buildSimpleMenuItem("World"));
        subMenu.add(buildSimpleMenuItem("Menus!"));
        
        return subMenu;
    }
    
    /**
     * Builds a simple menu item. 
     * 
     * @param theText the text to appear on the menu item
     * @return a simple menu item
     */
    private JMenuItem buildSimpleMenuItem(final String theText) {
        final JMenuItem item = new JMenuItem(theText);
        item.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                JOptionPane.showMessageDialog(MenuExample.this, theText);
            }
        });
        return item;
    }
    
    /**
     * Creates a menu that demonstrates JRadioButtonMenuItems.
     * 
     * @return the menu
     */
    private JMenu buildColorButtonMenu() {
        final JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic(KeyEvent.VK_C);
        
        final JMenuItem chooseColorItem = new JMenuItem("Choose Color");
        final ButtonGroup group = new ButtonGroup();
        chooseColorItem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                final Color result = JColorChooser.showDialog(null, "A Color Chooser", null);
                if (result != null) {
                    myBlankArea.setBackground(result);
                    group.clearSelection();
                }
            }
        });
        
        colorMenu.add(chooseColorItem);
        colorMenu.addSeparator();

        colorMenu.add(createColorItems("Red", Color.RED, group));
        colorMenu.add(createColorItems("Blue", Color.BLUE, group));
        colorMenu.add(createColorItems("Green", Color.GREEN, group));
        
        return colorMenu;
    }
    
    /**
     * Creates a JRadioButtonMenuItem with a color action. 
     * 
     * @param theName the text to go on this item
     * @param theColor the color to set the action
     * @param theGroup the ButtonGroup to add this Radio Button to
     * @return a a JRadioButtonMenuItem with a color action
     */
    private JRadioButtonMenuItem createColorItems(final String theName, 
            final Color theColor, final ButtonGroup theGroup) {
        
        final JRadioButtonMenuItem colorItem = new JRadioButtonMenuItem(theName);
        theGroup.add(colorItem);
        colorItem.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                myBlankArea.setBackground(theColor);
                
            }
        });
        return colorItem;
    }
    
    /**
     * Builds a simple menu item. 
     * 
     * @return a simple menu item
     */
    private JMenu buildLoggingMenu() {
        final JMenu loggingMenu = new JMenu("Logging");
        final String onMsg = "Logging ON/off";
        final String offMsg = "Logging on/OFF";
        myLogging.setText(onMsg);
        
        //What does this do...?
        myLogging.setToolTipText("When checked, the TextArea displays all mouse events.");
        
        myLogging.setSelected(true);
        myLogging.addActionListener(new ActionListener() {
            
            //Why don't I do anything in here with the MouseEvents/Text area?
            //go check out eventOutput()
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                if (myLogging.isSelected()) {
                    
                    myLogging.setText(onMsg);
                } else {
                    myLogging.setText(offMsg);
                }
                
            }
        });
        
        loggingMenu.add(myLogging);
        return loggingMenu;
    }    
    
    /**
     * Helper method for when one of the demo MouseEvents happens. 
     * 
     * @param theEventDescription the description of what happened
     * @param theEvent the event object that called this method
     */
    private void eventOutput(final String theEventDescription, final MouseEvent theEvent) {
        //Check to see if the JCheckBoxMenuItem in the menu bar is selected. If it is,
        //display (log) the Events occurring this demo.
        if (myLogging.isSelected()) {
            myTextArea.append(theEventDescription
                    + " (" + theEvent.getX() + "," + theEvent.getY()
                    + ") detected on "
                    + theEvent.getComponent().getClass().getName()
                    + NEWLINE);
            myTextArea.setCaretPosition(myTextArea.getDocument().getLength());
        }
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
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
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
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        final JFrame frame = new JFrame("MouseMotionEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create and set up the content pane.
        final MenuExample newContentPane = new MenuExample();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        frame.setJMenuBar(newContentPane.createMenu(frame));
        
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