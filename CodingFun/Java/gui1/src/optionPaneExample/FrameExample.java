/*
 * Frame example
 */

package optionPaneExample;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
        setVisible(true);
        JOptionPane.showMessageDialog(this, "Hello, Welcome to Javatpoint.");
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
