/*
 * Frame example
 */

package panelExample;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


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

        setSize(400, 500);

        final JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        panel.setLayout(null);
        add(panel);//add panel to the frame

        // Button1
        final JButton button1 = new JButton("Click Here");
        button1.setBounds(50, 100, 95, 30);
        button1.setBackground(Color.yellow);

        // add(button1); //adds button1 to the frame directly

        panel.add(button1); //add button to the panel

        setLocationRelativeTo(null); //centers the frame to windows screen
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
