package exercises;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class exercise1 extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 458397739634827736L;

    /*
     * Q1. create a frame 400*400, add a panel, add a button to a panel named
     * "click me"
     * 
     *  Q2. create a label with text "Is clicked?" and add it to the panel
     *  
     *  Q3. when the button is
     * clicked, the labels text should be changed to "Yes"
     * 
     * Q4. when the button is clicked, a MessgageDialog with information message
     * "You have clicked the box" should appear.
     * 
     */
    
    /**
     * Constructor.
     */
    public exercise1() {
        super("Frame");
    }
    
    /**
     * Method to set up components.
     */
    public void start() {
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // panel
        final JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        add(panel);

        // button
        final JButton button = new JButton("Click Me");
        button.setBounds(50, 100, 95, 30);
        button.setBackground(Color.yellow);
        panel.add(button);
        
        // label
        final JLabel label = new JLabel("Is clicked?");
        panel.add(label);
        
        // adding action listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                label.setText("Yes");
                JOptionPane.showMessageDialog(null, "You have clicked the box");
            }
        });
    }
    
    /**
     * Main method.
     * @param theArgs
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final exercise1 frame = new exercise1();
                frame.start();
            }
        });
    }
}
