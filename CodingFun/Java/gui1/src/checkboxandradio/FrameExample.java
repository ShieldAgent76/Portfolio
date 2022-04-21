/*
 * Frame example
 */

package checkboxandradio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
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

        setSize(600, 600);

        // Button1
        final JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(100, 100, 100, 50);
        add(checkBox1);

        final JCheckBox checkBox2 = new JCheckBox("Java", true);
        checkBox2.setBounds(100, 150, 100, 50);
        add(checkBox2);

        final JRadioButton r1 = new JRadioButton("A) Male");
        r1.setBounds(100, 200, 100, 30);
        add(r1);

        final JRadioButton r2 = new JRadioButton("B) Female");
        r2.setBounds(200, 200, 100, 30);
        add(r2);

        final ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // bg.add(checkBox2);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
