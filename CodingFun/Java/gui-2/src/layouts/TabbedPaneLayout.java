package layouts;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Demonstrates all three Layouts working together!
 * Use the Panels built earlier to save having to re-write code. 
 * 
 * @author Charles Bryan
 * @version Autumn 2016
 */
public class TabbedPaneLayout extends JPanel {

    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 3726560300045331301L;

    /** The GridLayout panel. */
    private final GridLayoutDemo myGridDemo;
    
    /** The FLowLayout panel. */
    private final FlowLayoutDemoAsPanel myFlowDemo;
    
    /** The BorderLayout panel. */
    private final BorderLayoutDemo myBorderDemo;
    

    /**
     * Initializes the Panel.
     */
    public TabbedPaneLayout() {
        super();
        //instantiate a new GridLayoutDemo Panel but don't lay it out.
        //don't forget to call start() later! What happens if you do forget?
        myGridDemo = new GridLayoutDemo();
        
        //instantiate a new FlowLayoutDemoAsPanel Panel but don't lay it out.
        //don't forget to call start() later! What happens if you do forget?
        //what happens if you add more Strings to the initializer list below? 
        myFlowDemo = new FlowLayoutDemoAsPanel();
        
        myBorderDemo = new BorderLayoutDemo();
    }
    
    
    /**
     * Lay out the components and makes this frame visible.
     */
    public void setUpComponents() {
        final JTabbedPane tabbedPane = new JTabbedPane(); 
        
        myFlowDemo.start();
        tabbedPane.add("Flow Demo", myFlowDemo);
        
        myBorderDemo.start();
        tabbedPane.add("Border Demo", myBorderDemo);

        
        myGridDemo.start();
        tabbedPane.add("Grid Demo", myGridDemo);
        
        add(tabbedPane);
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
                final TabbedPaneLayout mainPanel = new TabbedPaneLayout();
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
