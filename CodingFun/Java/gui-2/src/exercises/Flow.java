
package exercises;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Flow extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 7506577325297837687L;

    /*
     * Recreate the gui given in slide 11 of GUI Part 2
     */
    
    /**
     * Method to set up component.
     */
    public void start() {
        setTitle("Flow");
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("2"));
        add(new JButton("Button 3"));
        add(new JButton("Long-Named Button 4"));
        add(new JButton("Button 5"));
        
        setResizable(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    /**
     * Main method.
     * @param theArgs
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flow().start();
            }
        });
    }
}
