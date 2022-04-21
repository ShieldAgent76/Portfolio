/*
 * TCSS 305
 * 
 * A first JFrame demo.
 */

package fullFrameExample;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * A first demonstration of JFrame.
 * 
 * This demonstration shows how to create a class that extends JFrame.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @author Charles Bryan
 * @version Autumn 2016
 */
public final class FirstJFrame extends JFrame { // JFrame is the top level window

    /*
     * JFrame implements Serializable. We will cover Serializable later this quarter when time
     * allows. For now just have Eclipse generate a serial version UID as shown below. If you
     * would like to learn about Serialization check the following two links:
     * 
     * http://www.tutorialspoint.com/java/java_serialization.htm
     * 
     * http://www.javapractices.com/topic/TopicAction.do?Id=45
     */
    /** A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 5756891741199164658L;

    /** A size for the JFrame. */
    private static final Dimension FRAME_SIZE = new Dimension(250, 630);

    /**
     * Initializes the JFrame.
     */
    public FirstJFrame() {
        // The JFrame's overloaded constructor can set the JFrame title.
        super("TCSS 305B - Autumn 2018");
    }

    /**
     * Displays a simple JFrame.
     */
    public void start() {

        // Don't forget to set the close operation!
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // The default JFrame size is VERY small, so set it to something reasonable
        setSize(FRAME_SIZE);

        /*
         * Attempt to center the frame on the screen. There are better ways to do this which be
         * demonstrated soon.
         */
        setLocationRelativeTo(null);

        /*
         * This example uses the names "Foo" and "Bar" which often show up in Java examples. To
         * learn more about this and other hacker jargon, check out The New Hacker's Dictionary
         * at http://www.outpost9.com/reference/jargon/jargon_toc.html
         */

        // Note that BorderLayout is the default layout manager for JFrame.
        add(new JButton("Foo"), BorderLayout.NORTH);
        add(new JButton("Bar"), BorderLayout.WEST);

        // JPanel is a useful container for organizing components inside a JFrame
        final JPanel centerPanel = new JPanel();

        /*
         * FlowLayout is the default layout manager for JPanel. When components are added to a
         * JPanel the are added left to right by default. Line wrapping will occur as
         * necessary.
         */
        centerPanel.add(new JButton("Foo2"));
        centerPanel.add(new JButton("Bar2"));

        /*
         * Border Layout is the default layout manager for JFrame. If we do not specify a
         * location within the layout, then components are added to BorderLayout.Center by
         * default. Therefore, the next line of code adds centerPanel to the center of the
         * JFrame.
         */
        add(centerPanel, BorderLayout.CENTER);

        // pack() resizes the Frame to fit the contents of the frame
        // using this will ignore the size we set previously

         //pack();

        setVisible(true);
    }

}
