package layouts;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates Grid layout.
 * 
 * @author Charles Bryan
 * @version Autumn 2016
 */
public class GridLayoutDemo extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = -4024144513823395712L;

    /** The number of rows. */
    private static final int ROW = 4;
    
    /** The number of columns. */
    private static final int COL = 3;   
    
    /** The recommended size of the buttons. */
    private static final Dimension KEY_SIZE = new Dimension(50, 50);
    
    /** What should be on the buttons. */
    private static final String[] KEYS = {
        "1", "2", "3",
        "4", "5", "6",
        "7", "8", "9",
        "*", "0", "#" };
    
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
                final GridLayoutDemo mainPanel = new GridLayoutDemo();
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
