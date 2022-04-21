package layouts;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrating FlowLayout.
 * 
 * @author Charles Bryan
 * @version Autumn 2016
 */
public class FlowLayoutDemoAsPanel extends JPanel {

    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 5105689607757907009L;
    
    /** The default amount of JButtons this window will have, 7. */
    private static final int NUMBER_OF_BUTTONS = 7;
    
    /** The default text to appear on the JButtons. */
    private static final String BUTTON_TEXT = "Button ";

    /** The amount of JButtons this window will have. */
    private final int myNumberOfButtons;
    
    /** The labels on the button in this panel. */
    private final String[] myButtonLabels;
    
    /**
     * Initializes all of the fields.
     * @param theButtonLabels the labels to be used on buttons in this panel.
     */
    public FlowLayoutDemoAsPanel(final String[] theButtonLabels) {
        super();
        myNumberOfButtons = theButtonLabels.length;
        myButtonLabels = theButtonLabels.clone();
    }
    
    /**
     * Initializes all of the fields.
     */
    public FlowLayoutDemoAsPanel() {
        super();
        setLayout(new FlowLayout(FlowLayout.RIGHT));
        
        myNumberOfButtons = NUMBER_OF_BUTTONS;
        myButtonLabels = new String[NUMBER_OF_BUTTONS];
        for (int i = 0; i < myButtonLabels.length; i++) {
            myButtonLabels[i] = BUTTON_TEXT + i;
        }
    }
    
    /**
     * Lay out the components and makes this frame visible.
     */
    public void start() {
        
        final JButton[] buttons = new JButton[myNumberOfButtons];
        
        //Create and add a button for each index in the array.
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(myButtonLabels[i]);
            add(buttons[i]);
        }
    }
    
    /**
     * Creates a JFrame to demonstrate FlowLayout.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final FlowLayoutDemoAsPanel mainPanel = new FlowLayoutDemoAsPanel();
                mainPanel.start();
                
                // A size for the JFrame.
                final Dimension frameSize = new Dimension(400, 400);
                
                final JFrame window = new JFrame("Demo FlowLayout");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setContentPane(mainPanel);
                window.setSize(frameSize);
                window.setResizable(false);
                window.pack();
                window.setVisible(true);
            }
        });
    }

}
