/*
 * Frame example
 */

package jfileChooser;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 * create a frame object.
 * 
 * @author athirai
 * @version 1.0
 */

public class FrameExample extends JFrame {
    /**
     * serial version uid.
     */
    private static final long serialVersionUID = 1L;

    /**
     * constructor.
     */
    public FrameExample() {
        super("Demo");
    }

    /**
     * set up.
     */
    public void start() {

        
        final JFileChooser chooser = new JFileChooser(".");
        final int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION)
        {
            final File selectedFile = chooser.getSelectedFile();
          String fileName = selectedFile.getAbsolutePath();
          System.out.println(fileName);
        }

        
        
    }

    /**
     * Main method.
     * 
     * @param theArgs arguments.
     */
    public static void main(final String[] theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                final FrameExample frame = new FrameExample();
                frame.start();
                
            }
        });
    }

}
