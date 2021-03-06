/*
 * SnapShopGUI class
 */

package gui;

import filters.EdgeDetectFilter;
import filters.EdgeHighlightFilter;
import filters.Filter;
import filters.FlipHorizontalFilter;
import filters.FlipVerticalFilter;
import filters.GrayscaleFilter;
import filters.SharpenFilter;
import filters.SoftenFilter;
import image.PixelImage;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 * 
 * @author Martin Lillo
 * @version TCSS 305 Winter 2021
 */
public class SnapShopGUI extends JFrame {
    
    /**
     * Generated serial number UID.
     */
    private static final long serialVersionUID = -2144739668936849562L;
    
    /**
     * Stores image value.
     */
    private PixelImage myImage;
    
    /**
     * Stores JButtons.
     */
    private ArrayList<JButton> myButtons;

    /**
     * SnapShopGUI Constructor.
     */
    public SnapShopGUI() {
        myButtons = new ArrayList<JButton>();
    }
    
    /**
     * Set up method.
     */
    public void start() {
        setLayout(new BorderLayout());
        final Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\marti\\Documents\\University of Washington Tacoma\\Programming Practicum\\lillom-snapshop\\icons\\smile.jpg");
        
        // all filter buttons
        final JPanel filters = new JPanel();
        add(filters, BorderLayout.NORTH);
        
        addFilter(new EdgeDetectFilter(), filters);
        addFilter(new EdgeHighlightFilter(), filters);
        addFilter(new FlipHorizontalFilter(), filters);
        addFilter(new FlipVerticalFilter(), filters);
        addFilter(new GrayscaleFilter(), filters);
        addFilter(new SharpenFilter(), filters);
        addFilter(new SoftenFilter(), filters);
        
        // panel and label for images
        final JPanel imagePanel = new JPanel();
        add(imagePanel, BorderLayout.CENTER);
        
        final JLabel imageLabel = new JLabel();
        imagePanel.add(imageLabel);
        
        // all bottom buttons
        final JPanel options = new JPanel();
        add(options, BorderLayout.SOUTH);
        
        final JButton openImage = new JButton("Open");
        options.add(openImage);
        
        final JFileChooser chooser = new JFileChooser("sample_images");
        
        openImage.addActionListener(new ActionListener() {
            /**
             * Opens images.
             * @param arg0
             */
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                openFile(chooser, imageLabel);

            }
        });
        
        final JButton saveAs = new JButton("Save As");
        options.add(saveAs);
        myButtons.add(saveAs);
        saveAs.addActionListener(new ActionListener() {

            /**
             * Saves image.
             * @param arg0
             */
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                saveFile(chooser, imageLabel);
            }

        });

        final JButton closeButton = new JButton("Close Image");
        options.add(closeButton);
        myButtons.add(closeButton);
        closeButton.addActionListener(new ActionListener() {
            /**
             * Closes the image.
             * @param arg0
             */
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                closeFile(chooser, imageLabel);
            }
        });

        disableButton();
        pack();
        setVisible(true);
        setIconImage(icon);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Disables all buttons.
     */
    private void disableButton() {

        for (JButton b : myButtons) {
            b.setEnabled(false);
        }
    }

    /**
     * Enables all buttons.
     */
    private void enableButton() {

        for (JButton b : myButtons) {
            b.setEnabled(true);
        }
    }

    /**
     * Add filters to the image.
     * @param theFilter 
     * @param thePanel 
     */
    public void addFilter(final Filter theFilter, final JPanel thePanel) {

        final JButton button = new JButton(theFilter.getDescription());
        myButtons.add(button);
        thePanel.add(button);
        button.addActionListener(new ActionListener() {

            /**
             * Applies the filter
             * @param arg0 
             */
            @Override
            public void actionPerformed(final ActionEvent arg0) {
                theFilter.filter(myImage);
                repaint();
            }
        });

    }

    /**
     * Closes program.
     * @param theLabel
     */
    public void closeBox(final JLabel theLabel) {

        disableButton();
        theLabel.setIcon(null);
        setMinimumSize(null);
        pack();
    }
    
    /**
     * Throws invalid file. 
     * @param theE 
     */
    public void invalidEntry(final IOException theE) {
        JOptionPane.showMessageDialog(null, theE, "Invalid Entry", JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Saves the image.
     * @param theChooser
     * @param theLabel
     */
    public void saveFile(final JFileChooser theChooser, final JLabel theLabel) {

        final int result = theChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            final File f = theChooser.getSelectedFile();
            try {
                myImage.save(f);
                JOptionPane.showMessageDialog(null, "Image has been saved!");
                

                final int response = tryAgain(theLabel, "Try another file?");
                if (response == JOptionPane.YES_OPTION) {
                    openFile(theChooser, theLabel);
                }
                

            } catch (final IOException e) {
                invalidEntry(e);

                final int response = tryAgain(theLabel, "Would you like to try again?");
                if (response == JOptionPane.YES_OPTION) {
                    saveFile(theChooser, theLabel);
                }
            }
        }
        if (result == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Image was not saved.");     
        }
    }
    
    /**
     * Opens image.
     * @param theChooser 
     * @param theLabel 
     */
    public void openFile(final JFileChooser theChooser, final JLabel theLabel) {
        
        final int result = theChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            final File f = theChooser.getSelectedFile();

            try {
                myImage = PixelImage.load(f);
                theLabel.setIcon(new ImageIcon(myImage));
                pack();
                setMinimumSize(getSize());
                enableButton();
            } catch (final IOException e) {
                invalidEntry(e);

                final int response = tryAgain(theLabel, "Would you like to try another file?");
                if (response == JOptionPane.YES_OPTION) {
                    openFile(theChooser, theLabel);
                }
            }
        }
    }
    
    /**
     * Closes image.
     * @param theChooser 
     * @param theLabel 
     */
    public void closeFile(final JFileChooser theChooser, final JLabel theLabel) {
        final int response = JOptionPane.showConfirmDialog
                        (null, "Would you like to save your work?");
        if (response == JOptionPane.YES_OPTION) {
            saveFile(theChooser, theLabel);
        }
        if (response == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "File was not saved");
        }
        closeBox(theLabel);
    }
    
    /**
     * Shows message box.
     * @param theLabel
     * @param theMsg
     * @return int
     */
    private int tryAgain(final JLabel theLabel, final String theMsg) {
        final int response = JOptionPane.showConfirmDialog(null, theMsg);
        if (response == JOptionPane.NO_OPTION) {
            closeBox(theLabel);
        }
        return response;
    } 
}