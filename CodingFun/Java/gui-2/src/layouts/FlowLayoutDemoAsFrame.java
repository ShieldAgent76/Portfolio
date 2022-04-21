package layouts;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A Java Swing "window" demonstrating FlowLayout.
 * 
 * @author Charles Bryan
 * @version Autumn 2016
 */
public class FlowLayoutDemoAsFrame extends JFrame {

    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = -3642224326687149881L;

    //change the number of buttons and see what happens!
    /** The amount of JButtons this window will have. */
    private static final int NUMBER_OF_BUTTONS = 7;
    
    //change the text here and see what happens!
    /** The default text to appear on the JButtons. */
    private static final String BUTTON_TEXT = "Clap ";

    /**
     * Initializes the JFrame.
     */
    public FlowLayoutDemoAsFrame() {
        super("Demo of FlowLayout");
    }
    
    /**
     * Lay out the components and makes this frame visible.
     */
    public void start() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setSize(new Dimension(300, 300));

        setTitle("Set Title");
        
        //changes this JFrames default layout (BorderLayout) to FlowLayout
        //You can change the alignment of the flow by sending in different arguments to 
        //the constructor. Try some.
        setLayout(new FlowLayout());

                
        final JButton[] buttons = new JButton[NUMBER_OF_BUTTONS];
        
        //Create and add a button for each index in the array.
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(BUTTON_TEXT + i);
            add(buttons[i]);
        }
        
        
        setResizable(true);
        pack();
        setVisible(true);
    }
    
    /**
     * Creates a FlowLayoutDemo to demonstrate FlowLayout.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlowLayoutDemoAsFrame().start();
            }
        });
    }

}
