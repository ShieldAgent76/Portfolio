package exercises;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel {
    /*
     * Recreate the gui given in slide 12 of GUI Part 2. 
     * 
     * 
     */
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = -4024144513823395712L;

    /** The number of rows. */
    private static final int ROW = 3;
    
    /** The number of columns. */
    private static final int COL = 2;   
    
    /** The recommended size of the buttons. */
    private static final Dimension KEY_SIZE = new Dimension(200, 50);
    
    /** What should be on the buttons. */
    private static final String[] KEYS = {
        "Button 1", "2",
        "Button 3", "Long-Named Button 4",
        "Button 4", 
        };
    
    /**
     * Lay out the components and makes this frame visible.
     */
    public void start() {
        setLayout(new GridLayout(ROW, COL));
                
        final JButton[] keyButtons = new JButton[KEYS.length];
        
        for (int i = 0; i < keyButtons.length; i++) {
            keyButtons[i] = new JButton(KEYS[i]);
            keyButtons[i].setPreferredSize(KEY_SIZE);
            add(keyButtons[i]);
        }
    }
    
    /**
     * Creates a JFrame to demonstrate GridLayout.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final Grid mainPanel = new Grid();
                mainPanel.start();
                
                // A size for the JFrame.
                final Dimension frameSize = new Dimension(400, 400);
                
                final JFrame window = new JFrame("Demo GridLayout");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setContentPane(mainPanel);
                window.setSize(frameSize);
                window.pack();
                window.setVisible(true);
            }
        });
    }
}
