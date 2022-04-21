/*
 * Frame example
 */

package buttonExample;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * create a frame object.
 * 
 * @author athirai
 * @version 1.0
 */

public class FrameExample extends JFrame {
    /**
     * serial version uid.
     */
    private static final long serialVersionUID = 1L;

    /**
     * constructor.
     */
    public FrameExample() {
        super("Demo");
    }

    /**
     * set up.
     */
    public void start() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        final JButton button1 = new JButton("Click Here");
        button1.setBounds(50, 100, 95, 30);
        add(button1); //adds button1 to frame

        setLayout(null); 
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

                final FrameExample frame = new FrameExample();
                frame.start();
            }
        });
    }

}
