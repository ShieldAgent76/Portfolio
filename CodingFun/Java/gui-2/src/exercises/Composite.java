package exercises;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import layouts.CompositeLayout;
import layouts.FlowLayoutDemoAsPanel;
import layouts.GridLayoutDemo;

public class Composite extends JPanel {
    /*
     * Recreate the gui given in slide 16 of GUI Part 2
     * 
     */  

    /**
     * Composite Constructor.
     */
    public Composite() {
        super();
    }
    
    /**
     * Method to set up components.
     */
    public void setUpComponents() {
        setLayout(new BorderLayout());
        final JPanel temp = new JPanel();
        temp.setLayout(new FlowLayout());
        final JButton button1 = new JButton("Button 1");
        final JButton button2 = new JButton("Button 2");
        temp.add(button1);
        temp.add(button2);
        final JButton button3 = new JButton("Center Button");
        add(temp, BorderLayout.NORTH);
        add(button3, BorderLayout.CENTER);
    }
    
    /**
     * Main method.
     * @param theArgs
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                final Composite mainPanel = new Composite();
                mainPanel.setUpComponents();
                final Dimension frameSize = new Dimension(400, 300);
                final JFrame window = new JFrame("Composite Exercise");
                window.setSize(frameSize);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setContentPane(mainPanel);
                window.setVisible(true);
            }
        });
    }
}
