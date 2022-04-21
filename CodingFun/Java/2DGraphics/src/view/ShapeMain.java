/*
 * TCSS305
 */

package view;

import java.awt.EventQueue;

/**
 * This class provides the start point for the persistent graphics demonstration program.
 * This program shows how to paint multiple shapes on a JPanel.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @version 1.1
 */
public final class ShapeMain {
    
    /**
     * Private constructor to inhibit instantiation.
     */
    private ShapeMain() {
        throw new IllegalStateException();
    }

    /**
     * The start point for the program.
     * 
     * @param theArgs command line arguments - ignored in this program
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShapeGUI().start(); // create and start the graphical user interface
            }
        });
    }

}
