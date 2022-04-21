/*
 * Java2D Ellipse and Rectangle Demo - TCSS 305
 */

package simple2dgraphics;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates the painting of ellipses (and rectangles).
 * 
 * @author Alan Fowler
 * @author Charles Bryan
 * @version 1.2
 */
public class EllipseAndRectanglePanel extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 8452917670991316606L; 
    
    /** The width of the panel. */
    private static final int WIDTH = 400;

    /** The height of the panel. */
    private static final int HEIGHT = 400;

    /** The stroke width in pixels. */
    private static final int STROKE_WIDTH = 10;

    /** The width for the rectangle. */
    private static final int RECTANGLE_WIDTH = 50;

    /** The height for the rectangle. */
    private static final int RECTANGLE_HEIGHT = 50;

    /**
     * Constructs a new ellipse panel.
     */
    public EllipseAndRectanglePanel() {
        super();
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
     * Paints some ellipses.
     * 
     * @param theGraphics The graphics context to use for painting.
     */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;

        // for better graphics display
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);

        final Shape ellipse = new Ellipse2D.Double(10, 10, 50, 100);
        g2d.setPaint(Color.ORANGE);
        g2d.setStroke(new BasicStroke(STROKE_WIDTH));
        g2d.draw(ellipse);

        final Shape rectangle =
                        new Rectangle2D.Double((getWidth() - RECTANGLE_WIDTH) / 2,
                                               (getHeight() - RECTANGLE_HEIGHT) / 2,
                                               RECTANGLE_WIDTH * 2, RECTANGLE_HEIGHT * 2);
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(STROKE_WIDTH));
//        g2d.setStroke(new BasicStroke(STROKE_WIDTH, BasicStroke.CAP_BUTT,
//                                      BasicStroke.JOIN_MITER, 1.5f));
        g2d.draw(rectangle);

        final Shape ellipse2 = new Ellipse2D.Double(50, 50, 125, 200);
        
        g2d.setPaint(Color.BLUE);
        g2d.fill(ellipse2);
        g2d.setPaint(Color.YELLOW);
        g2d.draw(ellipse2);

    }

    /**
     * Creates and displays an EllipsePanel.
     * 
     * @param theArgs Command line arguments (ignored).
     */
    public static void main(final String... theArgs) {
        final EllipseAndRectanglePanel panel = new EllipseAndRectanglePanel();
        final JFrame frame = new JFrame("EllipseAndRectanglePanel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }
}
