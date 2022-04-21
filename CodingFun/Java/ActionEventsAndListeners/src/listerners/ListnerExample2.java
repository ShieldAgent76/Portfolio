/*
 * Listener examples.
 */
package listerners;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 * @author athirai
 * @version 1.0
 */
public class ListnerExample2 extends JFrame {
    
    /**
     * serialUID.
     */
    private static final long serialVersionUID = 7263743277014630342L;
    
    /**
     * constructor.
     */
    ListnerExample2() {
        super("Frame");
    }
    
    /**
     * start method for setting up components.
     */
    void start() {
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // panel
        JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        add(panel);

        // Button1
        JButton button1 = new JButton("Click Here");
        button1.setBounds(50, 100, 95, 30);
        button1.setBackground(Color.yellow);
        panel.add(button1);

        // adding action listener

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                System.out.println("Button Clicked");

            }
        });

    }
    
    /**
     * main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                final ListnerExample2 frame = new ListnerExample2();
                frame.start();
            }
        });
    }

}
