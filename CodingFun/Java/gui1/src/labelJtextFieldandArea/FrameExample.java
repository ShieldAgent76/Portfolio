/*
 * Frame example
 */

package labelJtextFieldandArea;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        final JButton button1 = new JButton("Click Here");
        button1.setBounds(50, 100, 95, 30);
        add(button1);

        // Label 1
        final JLabel label1 = new JLabel("First Label");
        label1.setBounds(50, 50, 100, 30);
        label1.setText("hi");
        label1.setForeground(Color.BLUE);
        add(label1);

        // TextField 1
        final JTextField textfield1 = new JTextField("Welcome to TCSS305 textfield");
        textfield1.setBounds(50, 200, 200, 30);
        add(textfield1);

        // TextField 2 with multiple columns
        final JTextField textfield2 = new JTextField("Welcome to Javatpoint textfield", 2);
        textfield2.setBounds(50, 300, 200, 30);
        add(textfield2);

        // TextArea 1
        final JTextArea area1 = new JTextArea("Welcome to javatpoint area");
        area1.setBounds(50, 370, 200, 50);
        add(area1);

        setLayout(null);
        setVisible(true);
        // setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
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
