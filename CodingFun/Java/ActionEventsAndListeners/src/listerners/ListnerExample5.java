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
import javax.swing.JTextField;

/**
 * 
 * @author athirai
 * @version 1.0
 */
public class ListnerExample5 extends JFrame {
    /**
     * serialUID.
     */
    private static final long serialVersionUID = 7263743277014630342L;
    
    /**
     * constructor.
     */
    ListnerExample5() {
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
        panel.setLayout(null);
        add(panel);

        // TextField 1
        JTextField textfield1 = new JTextField();
        textfield1.setBounds(0, 0, 50, 50);
        panel.add(textfield1);
        
        // Button1
        JButton button1 = new JButton("Click Here");
        button1.setBounds(50, 100, 95, 30);
        button1.setBackground(Color.yellow);
        panel.add(button1);

        // adding action listener

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {

                int x = Integer.parseInt(textfield1.getText());
                System.out.println(x);
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

                final ListnerExample5 frame = new ListnerExample5();
                frame.start();
            }
        });
    }

}
