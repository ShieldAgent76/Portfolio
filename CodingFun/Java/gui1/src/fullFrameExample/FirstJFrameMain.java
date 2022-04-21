/*
 * TCSS 305
 */

package fullFrameExample;

import java.awt.EventQueue;

/**
 * This program starts a simple JFrame demo.
 * 
 * @author Alan Fowler acfowler@uw.edu
 * @version Spring 2015
 */
public final class FirstJFrameMain {

    /**
     * A private constructor to inhibit external instantiation.
     */
    private FirstJFrameMain() {

    }

    /**
     * The start point for a program that displays a simple frame.
     * 
     * @param theArgs command line arguments - ignored in this program
     */
    public static void main(final String[] theArgs) {
        /*
         * GUI programs are multi-threaded. We will not have time this quarter to cover the
         * many complex details of multi-threaded programming. You will learn about this when
         * you take the operating systems class. For now just copy the style of the code shown
         * below wherever you have a main method that is starting a GUI program.
         * 
         * This code is explained briefly in Chapter 7 of the Core Java book on pages 340-341.
         * 
         * If you would like to learn about multi-threaded programming on your own, then read
         * chapter 14 of the Core Java book.
         * 
         * An even more thorough and in depth treatment of multi-threaded programming in java
         * is found in the book "Java Concurrency in Practice" by Brian Goetz.
         */

        /*
         * Execute the GUI in the event dispatch thread (instead of the main thread).
         */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                FirstJFrame frame1 = new FirstJFrame();
                frame1.start();

                // OR, if it is clearer to you,
                // you could replace the single line shown above with
                // 2 equivalent lines of code:

                // DemoJFrame1 frame1 = new DemoJFrame1();
                // frame1.start();

            }
        });
    }

}
