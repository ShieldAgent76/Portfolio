/*
 * JOption pane example.
 */
package optionPaneExample;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/**
 * 
 * @author athirai
 *@version 1.0
 */
public class Dialog1 {

    /**
     * main function.
     * @param theArgs arguments
     */
    public static void main(final String[] theArgs) {
         JOptionPane.showMessageDialog(null,"Hello, Welcome to Javatpoint.");

         JOptionPane.showMessageDialog(null,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE); //parent component, message, title,message type
        
        String name=JOptionPane.showInputDialog("Enter Name");
        System.out.println(name);
        
        int response = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (response == JOptionPane.YES_OPTION)
            JOptionPane.showMessageDialog(null, "You selected YES", "Yes was selected",
                                          JOptionPane.PLAIN_MESSAGE);
        else if (response == JOptionPane.NO_OPTION) {
            Icon BYE = new ImageIcon("bye.jpg");
            JOptionPane.showMessageDialog(null, "You selected NO", "No was selected",
                                          JOptionPane.PLAIN_MESSAGE, BYE);
        } else
            JOptionPane.showMessageDialog(null, "You selected CANCEL", "Cancel was selected",
                                          JOptionPane.ERROR_MESSAGE);

    }
}
