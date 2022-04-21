/* 
 * TCSS 305 - Example code
 */

package tools;

import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 * A tool for drawing lines.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @version 1.1
 */
public class LineTool extends AbstractPaintTool {

    @Override
    public Shape getShape() {
        return new Line2D.Double(getStartPoint(), getEndPoint());
    }

}
