/*
 * exercises for gui-1
 */

package exercises;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;



/**
 * 
 * @author athirai
 * @version 1.0
 */
public class MyFrame extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /*
     * Q1. Display a frame of size 800*800 with title "Course 305". You should extend the the
     * JFrame class. The program should exit on clicking the close button
     */
    public void start() {
        // frame
        final JFrame window = new JFrame("Course 305");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null); 
        window.setSize(800, 800);
        window.setVisible(true);
        
        // button panel
        final JPanel buttonPanel = new JPanel();
        buttonPanel.setBounds(40, 80, 200, 200);
        buttonPanel.setBackground(Color.gray);
        buttonPanel.setLayout(null);
        add(buttonPanel);
        
        // join button
        final JButton button = new JButton("Join");
        button.setBounds(50, 100, 95, 30);
        button.setBackground(Color.yellow);
        buttonPanel.add(button);
        
        // checkbox panel
        final JPanel checkboxPanel = new JPanel();
        checkboxPanel.setBounds(40, 80, 400, 200);
        checkboxPanel.setBackground(Color.green);
        checkboxPanel.setLayout(null);
        add(checkboxPanel);
        
        // check box
        final JCheckBox checkBox = new JCheckBox("305", true);
        checkBox.setBounds(300, 200, 100, 50);
        add(checkBox);
        
        // text area
        final JTextArea area = new JTextArea("In the jungle" + "\nThe mighty jungle" + "\nThe lion sleeps tonight");
        area.setBounds(50, 370, 200, 50);
        add(area);
        
        // radio buttons
        final JRadioButton good = new JRadioButton("Good");
        good.setBounds(100, 300, 100, 30);
        add(good);

        final JRadioButton bad = new JRadioButton("Bad");
        bad.setBounds(200, 300, 100, 30);
        add(bad);

        final ButtonGroup bg = new ButtonGroup();
        bg.add(good);
        bg.add(bad);
        
        final int response = JOptionPane.showConfirmDialog(null, "Are you a student?");
        if (response == JOptionPane.NO_OPTION) {
            final Icon bye = new ImageIcon("bye.jpg");
            JOptionPane.showMessageDialog(null, "Please close the program", "No was selected",
                                          JOptionPane.PLAIN_MESSAGE, bye);
        }
        
        setLocationRelativeTo(null); //centers the frame to windows screen
        setLayout(null);
        setVisible(true);
    }

    /*
     * Q2. Add a panel called button panel to the frame
     */
    

    /*
     * Q3. Add a button with text "Join" to the button panel
     * 
     */
       

    /*
     * Q4. Add a panel called checkbox panel to the frame
     * 
     */
        
        
       

    /*
     * 
     * Q5. Add 1 checkbox with label 305 and by default it should be selected
     * 
     * Q6. Add 2 radiobuttons with labels, good, bad. These radio button should belong to the
     * same button group
     * 
     */

    /*
     * Q7. Add a textarea to the frame directly (not to any of the panels)
     * 
     * 
     */
    
      

    /*
     * Q8. When you run your program, first a Confirm dialog box (on top of the created frame) with a message
     * "Are you a student" should appear. If response is yes, do nothing If response is no, show
     * a MessageDialog on top of the frame with an error message "please close the program"
     * with icon "bye.jpg"
     * 
     * 
     * 
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                final MyFrame frame = new MyFrame();
                frame.start();
               
            }
        });
        
            
    }
}
  
