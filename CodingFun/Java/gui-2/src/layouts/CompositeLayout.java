package layouts;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates all three Layouts working together!
 * Use the Panels built earlier to save having to re-write code. 
 * 
 * @author Charles Bryan
 * @version Autumn 2016
 */
public class CompositeLayout extends JPanel {

    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 3726560300045331301L;

    /** The keypad panel. */
    private final GridLayoutDemo myKeypad;
    
    /** The button panel. */
    private final FlowLayoutDemoAsPanel myButtons;
    

    /**
     * Initializes the Panel.
     */
    public CompositeLayout() {
        super();
        //instantiate a new GridLayoutDemo Panel but don't lay it out.
        //don't forget to call start() later! What happens if you do forget?
        myKeypad = new GridLayoutDemo();
        
        //instantiate a new FlowLayoutDemoAsPanel Panel but don't lay it out.
        //don't forget to call start() later! What happens if you do forget?
        //what happens if you add more Strings to the initializer list below? 
        myButtons = new FlowLayoutDemoAsPanel(new String[] {"Cancel", "Send"});
    }
    
    
    /**
     * Lay out the components and makes this frame visible.
     */
    public void setUpComponents() {
        setLayout(new BorderLayout());
        
        final JPanel temp = new JPanel();
               
        myKeypad.start();
        temp.add(myKeypad);
        add(temp, BorderLayout.CENTER);
 
        myButtons.start();
        add(myButtons, BorderLayout.SOUTH);
    }
    
    /**
     * Creates a JFrame to demonstrate Composite Layouts.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final CompositeLayout mainPanel = new CompositeLayout();
                mainPanel.setUpComponents();
                
                // A size for the JFrame.
                //final Dimension frameSize = new Dimension(400, 400);
                
                final JFrame window = new JFrame("Demo a Composite Layout");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setContentPane(mainPanel);
                //window.setSize(frameSize);
                window.pack();
                window.setVisible(true);
            }
        });
    }
}
