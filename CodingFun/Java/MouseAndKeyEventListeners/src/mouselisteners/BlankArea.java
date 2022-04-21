
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

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * A Helper class for some examples.
 * BlankArea.java is used by:
 *    MouseEventDemo.java.
 *    MouseMotionEventDemo.java
 *  @author Oracle and/or its affiliates
 *  @author Charles Bryan
 *  @version Autumn 2015 (Edited only to match CheckStyle rules)
 */
public class BlankArea extends JLabel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 3316811765624525730L;
    
    /** The default width value. */
    private static final int WIDTH = 100; 
    
    /** The default height value. */
    private static final int HEIGHT = 250;
    
    /** The minimum size this component should be. */
    private static final Dimension MIN_SIZE = new Dimension(WIDTH, HEIGHT);
 
    /**
     * Constructs a BlankArea given the color.
     * 
     * @param theColor the color to set this area to
     */
    public BlankArea(final Color theColor) {
        super();
        setBackground(theColor);
        setOpaque(true); //not transparent, In Swing, an opaque component paints every pixel within its rectangular bounds. A non-opaque component paints only a subset of its pixels or none at all, allowing the pixels underneath it to show through
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
 
    @Override
    public Dimension getMinimumSize() {
        return MIN_SIZE;
    }
 
    @Override
    public Dimension getPreferredSize() {
        return MIN_SIZE;
    }
    
//    public static void main(String[] args) {
//        javax.swing.SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                createAndShowGUI();
//            }
//        });
//    }
//    
//    private static void createAndShowGUI() {
//        //Create and set up the window.
//        final JFrame frame = new JFrame("MouseEventDemo");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new GridLayout(0,1));
//        BlankArea myBlankArea = new BlankArea(Color.YELLOW);
//        frame.setContentPane(myBlankArea);
//        
//        //Display the window.
//        frame.pack();
//        frame.setVisible(true);
//    }
}