package exercises;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.*;
import layouts.BorderLayoutDemo;

public class Border extends JPanel {
    
    /*
     * Recreate the gui given in slide 10 of Intro to GUI Part 2
     * 
     */
    
    /**
     * Lay out the components and makes this frame visible.
     */
    public void start() {
        setLayout(new BorderLayout());
        final JButton north = new JButton("Button 1 (NORTH)");
        add(north, BorderLayout.NORTH);
        final JButton center = new JButton("2 (CENTER)");
        add(center, BorderLayout.CENTER);
        final JButton west = new JButton("Button 3 (WEST)");
        add(west, BorderLayout.WEST);
        final JButton south = new JButton("Long-Named Button 4 (SOUTH)");
        add(south, BorderLayout.SOUTH);        
        final JButton east = new JButton("Button 5 (EAST)");
        add(east, BorderLayout.EAST);         
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
                final Border mainPanel = new Border();
                mainPanel.start();
                
                final Dimension frameSize = new Dimension(400, 400);
                
                final JFrame window = new JFrame("Border");
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // window.add(mainPanel);
                window.setContentPane(mainPanel);
                window.setSize(frameSize);
                // window.pack(); // either use setsize or pack. pack sizes the frame so that the components are at or abvoe their preferred size
               
                window.setVisible(true);
            }
        });
    }
}
