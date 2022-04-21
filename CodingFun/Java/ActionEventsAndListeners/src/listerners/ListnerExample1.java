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
public class ListnerExample1 extends JFrame  {

    /**
     * serialUID.
     */

    private static final long serialVersionUID = 7263743277014630342L;

   

    /**
     * constructor.
     */
    ListnerExample1() {
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
        final JPanel panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.gray);
        add(panel);

        // Button1
        final JButton button1 = new JButton("Click Here");
        button1.setBounds(50, 100, 95, 30);
        button1.setBackground(Color.yellow);
        panel.add(button1);

        // adding action listener

        button1.addActionListener(new MyButtonListener());

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

                final ListnerExample1 frame = new ListnerExample1();
                frame.start();

            }
        });
    }
    
    
    /**
     * An Inner class that is an ActionListener for Button clicks.
     * 
     * @author athirai
     * @version 1.0
     */
    private class MyButtonListener implements ActionListener {

        @Override
        public void actionPerformed(final ActionEvent theEvent) {
            System.out.println("Button Clicked");
            System.out.println(theEvent.getSource());
            System.out.println(theEvent.getActionCommand());
            System.out.println(theEvent.getWhen());
            

        }

    }

}
