/*
 * Frame example
 */

package frameExample;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * create a frame object.
 * 
 * @author athirai
 * @version 1.0
 */

public class Frame2 extends JFrame {
    /**
     * serial version uid.
     */
    private static final long serialVersionUID = 1L;

    /**
     * constructor.
     */
    public Frame2() {
        super("Demo");
    }

    /**
     * set up.
     */
    public void start() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        setSize(400, 400);
        setVisible(true);
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

                final Frame2 frame = new Frame2();
                frame.start();
            }
        });
    }

}
