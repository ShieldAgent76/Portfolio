/* 
 * TCSS 305 - Example code
 */

package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * A tool for drawing circles.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @version 1.1
 */
public class CircleTool extends AbstractPaintTool {

    @Override
    public Shape getShape() {
        final Ellipse2D.Double circle = new Ellipse2D.Double();
        final Point start = getStartPoint();
        final Point end = new Point(start.x + 20, start.y + 20);
        circle.setFrameFromCenter(start, end);
        return circle;
    }

}
