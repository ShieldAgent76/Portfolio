package exercise;

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

public class GraphicsExample extends JPanel {
    /*
     * 1. draw the shown figure 
     * 
     * 
     * 
     */
  
    /**
     * Generated UID.
     */
    private static final long serialVersionUID = -2470908184755302479L;
    
    /** 
     * Panel width.
     */
    private static final int PANEL_WIDTH = 400;

    /**
     * Panel height.
     */
    private static final int PANEL_HEIGHT = 400;
    
    /**
     * Pixel stroke width.
     */
    private static final int STROKE_WIDTH = 5;
    
    /**
     * Constructor.
     */
    public GraphicsExample() {
        super();
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }
    
    /**
     * Paints shapes.
     * @param theGraphics
     */
    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2d = (Graphics2D) theGraphics;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        
        // shapes
        final Shape rectangle1 = new Rectangle2D.Double(0, 0, 10, 10);
        g2d.setPaint(Color.RED);
        g2d.setStroke(new BasicStroke(STROKE_WIDTH));
        g2d.fill(rectangle1);
        
        final Shape rectangle2 = new Rectangle2D.Double(0, 0, 10, 100);
        g2d.setPaint(Color.ORANGE);
        g2d.draw(rectangle2);
        
        final Shape rectangle3 = new Rectangle2D.Double(110, 0, 10, 100);
        g2d.setPaint(Color.YELLOW);
        g2d.draw(rectangle3);
        
        final Shape ellipse1 = new Ellipse2D.Double(10, 0, 100, 100);
        g2d.setPaint(Color.GREEN);
        g2d.draw(ellipse1);
        
        final Shape ellipse2 = new Ellipse2D.Double(35, 50, 50, 50);
        g2d.setPaint(Color.BLUE);
        g2d.fill(ellipse2);
    }
    
    /**
     * Main Method.
     * @param theArgs
     */
    public static void main(final String[] theArgs) {
        final GraphicsExample panel = new GraphicsExample();
        final JFrame frame = new JFrame("GraphicsExercise Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }
}
