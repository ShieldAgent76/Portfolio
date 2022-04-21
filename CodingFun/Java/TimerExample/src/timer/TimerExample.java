/*
 * example of Timer
 */
package timer;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;



/**
 * 
 * @author athirai
 *  @version 1.0
 */
public class TimerExample extends JFrame{
    
    /**
     * 
     */
    private static final long serialVersionUID = -6257548485239497170L;
    
    /** The default delay (in milliseconds) for the timer. */
    public static final int DELAY = 0;

    /** The initial delay (in milliseconds) for the timer. */
    public static final int INITIAL_DELAY = 0;
    
    /** The timer  */
    private final Timer myTimer;
    
    /** panel which changes color*/
    final JPanel myPanel ;

    public TimerExample() {
        super("Timer Example");
        
        myPanel = new JPanel();

        myTimer = new Timer(DELAY, new TimeListener());
        
        // wait before the first timer event
        myTimer.setInitialDelay(INITIAL_DELAY); 
    }
    
    
    
    /**
     * start method.
     */
    public void start() {
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(400,400);
        setLayout(null);
        setVisible(true);
        
        //add the panel to the frame
        
        myPanel.setBounds(40, 80, 300, 100);
        myPanel.setBackground(Color.GRAY);
        add(myPanel);
        
       myTimer.start();
        
    }
    
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              
                 final TimerExample window = new TimerExample();
                 window.start();
                
            }
        });
    }
    
    
    
 // *********** Inner Class Listener   *********************************

    /**
     * A class that listens for timer events and moves the shape, checking for
     * the window boundaries and changing direction as appropriate.
     */
    private class TimeListener implements ActionListener {
        
        @Override
        public void actionPerformed(final ActionEvent theEvent) {
            //

            myPanel.setBackground(new Color((int)(Math.random() * 0x1000000)));

            repaint();
        }
    }
}
