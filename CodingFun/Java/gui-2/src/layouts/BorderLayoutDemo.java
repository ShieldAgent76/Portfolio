/*
 * class for border layout.
 */
package layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates Border layout.
 * 
 * @author Charles Bryan
 * @version Autumn 2016
 */
public class BorderLayoutDemo extends JPanel {
    

    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 8557044779441785202L;

    /**
     * Lay out the components and makes this frame visible.
     */
    public void start() {
        
        setLayout(new BorderLayout());
        
        //What happens if you don't add one or two of the buttons
        //to this panel using BorderLayout? Try a couple to get
        //a good idea of the rules behind BorderLayout.
        //Try to resize the window with your mouse when running the
        //program. What happens to the compoents? 
        
        //final JPanel temp = new JPanel();
        final JButton north = new JButton("North");
        //temp.add(north);
        add(north, BorderLayout.NORTH);
        
        
        final JButton south = new JButton("South");
        add(south, BorderLayout.SOUTH);
        
        final JButton west = new JButton("West");
        add(west, BorderLayout.WEST);        
        
        final JButton east = new JButton("East");
        add(east, BorderLayout.EAST);

        //What happens if you add the JButton center to 
        //the this Panel object instead of nesting it inside of
        //centerPanel. Why do they look different?
        final JButton center = new JButton("Center");        
        final JPanel centerPanel = new JPanel();
        centerPanel.add(center);

        add(centerPanel, BorderLayout.CENTER);  
        
  
    }
    
    /**
     * Creates a JFrame to demonstrate BorderLayout.
     * It is OK, even typical to include a main method 
     * in the same class file as a GUI for testing purposes. 
     * 
     * @param theArgs Command line arguments, ignored.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final BorderLayoutDemo mainPanel = new BorderLayoutDemo();
                mainPanel.start();
                
                // A size for the JFrame.
                final Dimension frameSize = new Dimension(400, 400);
                
                final JFrame window = 
                    new JFrame("Demo BorderLayout");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //window.add(mainPanel);
                window.setContentPane(mainPanel);
                window.setSize(frameSize);
              // window.pack(); // either use setsize or pack. pack sizes the frame so that the components are at or abvoe their preferred size
               
                window.setVisible(true);
            }
        });
    }

}
