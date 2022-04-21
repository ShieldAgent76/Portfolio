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
public class ListnerExample3 extends JFrame {
    /**
     * serialUID.
     */
    private static final long serialVersionUID = 7263743277014630342L;
    
    /**
     * constructor.
     */
    ListnerExample3() {
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
        panel.setBounds(40, 80, 200, 300);
        panel.setBackground(Color.gray);
        add(panel);

        // dynamic creation of buttons:
        final JButton[] buttons = new JButton[3];

        // Create and add a button for each index in the array. instead of hard coding every
        // button
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("Button" + i);
            buttons[i].setBounds(50, 100 + i * 30, 95, 30);
            buttons[i].setBackground(Color.yellow);

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent theEvent) {
                    System.out.println(theEvent.getSource() + "Button Clicked");

                }
            });
            panel.add(buttons[i]);
        }

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

                final ListnerExample3 frame = new ListnerExample3();
                frame.start();
            }
        });
    }

}
