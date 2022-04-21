/*
 * Java2D Arc Demo - TCSS 305
 */

package simple2dgraphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Demonstrates the various types of arcs, and antialiasing.
 * 
 * @author Daniel M. Zimmerman
 * @author Alan Fowler
 * @author Charles Bryan
 * @version 1.2
 */
public class ArcPanel extends JPanel {
    
    /**  A generated serial version UID for object Serialization. */
    private static final long serialVersionUID = 8452917670991316606L; 

    /**
     * The panel width.
     */
    private static final int WIDTH = 600;

    /**
     * The panel height.
     */
    private static final int HEIGHT = 200;

    // Arc Constants

    /**
     * An open arc, at appropriate screen coordinates for display.
     */
    private static final Arc2D OPEN_ARC = new Arc2D.Double(10, 10, 150, 150, 290, 110,
                                                           Arc2D.OPEN);

    /**
     * A chord arc, at appropriate screen coordinates for display.
     */
    private static final Arc2D CHORD_ARC = new Arc2D.Double(200, 10, 150, 150, 290, 110,
                                                            Arc2D.CHORD);

    /**
     * A pie arc, at appropriate screen coordinates for display.
     */
    private static final Arc2D PIE_ARC = new Arc2D.Double(400, 10, 150, 150, 290, 110,
                                                          Arc2D.PIE);

    /**
     * Constructs a new arc panel.
     */
    public ArcPanel() {
        super();
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    /**
     * Paints the arcs.
     * 
     * @param theGraphics The graphics context to use for painting.
     */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setPaint(Color.BLUE);

        g2d.draw(OPEN_ARC);
        g2d.draw(CHORD_ARC);
        g2d.draw(PIE_ARC);
    }

    /**
     * Creates and displays an ArcPanel.
     * 
     * @param theArgs Command line arguments (ignored).
     */
    public static void main(final String... theArgs) {
        final ArcPanel panel = new ArcPanel();
        final JFrame frame = new JFrame("ArcPanel Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
