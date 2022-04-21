/*
 * Java2D General Path Demo - TCSS 305
 */

package simple2dgraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * An extremely basic painting panel with general paths.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @author Charles Bryan
 * @version 1.2
 */
public class PathPanel extends JPanel {

    /**
     * The panel width.
     */
    public static final int WIDTH = 400;

    /**
     * The panel height.
     */
    public static final int HEIGHT = 400;

    /**
     * The background color of the panel.
     */
    public static final Color BACKGROUND_COLOR = Color.WHITE;

    /**
     * The color to paint with.
     */
    public static final Color FOREGROUND_COLOR = Color.RED;

    /**
     * The line width.
     */
    public static final int LINE_WIDTH = 8;
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 8452917670991316606L; 

    // Instance Fields
    
    /**
     * The path being created.
     */
    private final Path2D myPath;
    
    // OR you could use Path2D.Double instead of GeneralPath

    // Constructor

    /**
     * Constructs a new general path panel.
     */
    public PathPanel() {
        super();
        myPath = new GeneralPath();
        myPath.setWindingRule(GeneralPath.WIND_EVEN_ODD);
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(BACKGROUND_COLOR);
        addMouseListener(new MyMouseListener());
    }

    /**
     * Paints the current path.
     * 
     * @param theGraphics The graphics context to use for painting.
     */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2d.setPaint(FOREGROUND_COLOR);
        g2d.setStroke(new BasicStroke(LINE_WIDTH));
        g2d.draw(myPath);

    }

    // Main Method

    /**
     * Creates and displays a GeneralPathPanel.
     * 
     * @param theArgs Command line arguments (ignored).
     */
    public static void main(final String... theArgs) {
        final PathPanel panel = new PathPanel();
        final JFrame frame = new JFrame("GeneralPathPanel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    // Inner Class

    /**
     * Listens for mouse clicks, to draw on our panel.
     */
    private class MyMouseListener extends MouseAdapter {
        /**
         * Handles a click event.
         * 
         * @param theEvent The event.
         */
        @Override
        public void mouseClicked(final MouseEvent theEvent) {
            
            if (myPath.getCurrentPoint() == null) {
                myPath.moveTo(theEvent.getX(), theEvent.getY());
            } else if (theEvent.getClickCount() == 2) {
                myPath.closePath();
            } else {
                myPath.lineTo(theEvent.getX(), theEvent.getY());
            }
            repaint();
        }
    }
    

}
