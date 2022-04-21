/*
 * Frame example
 */

package optionPaneExample;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * create a frame object.
 * 
 * @author athirai
 * @version 1.0
 */

public class Frame1 {

    /**
     * set up.
     */
    public void start() {
        final JFrame window = new JFrame("Demo");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.setSize(400, 400);
        window.setVisible(true);
        JOptionPane.showMessageDialog(window, "Hello, Welcome to Javatpoint.");
    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                final Frame1 frame = new Frame1();
                frame.start();
                
            }
        });
    }

}
