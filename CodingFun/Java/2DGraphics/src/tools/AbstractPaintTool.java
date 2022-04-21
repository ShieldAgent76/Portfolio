/* 
 * TCSS 305 - Example code
 */

package tools;

import java.awt.Point;

/**
 * Provides common implementations of some paint tool behaviors.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @version 1.2
 */
public abstract class AbstractPaintTool implements PaintTool {

    /** A point outside the drawing area. */
    public static final Point NO_POINT = new Point(-50, -50);

    /**
     * The initial anchor point for the shape drawn by this tool.
     */
    private Point myStartPoint;
    
    /**
     * The end point for the shape drawn by this tool.
     */
    private Point myEndPoint;

    /**
     * Constructs a paint tool.
     */
    public AbstractPaintTool() {
        myStartPoint = NO_POINT;
        myEndPoint = NO_POINT;
    }

    @Override
    public void setStartPoint(final Point thePoint) {      
        myStartPoint = thePoint;
        myEndPoint = thePoint;
    }

    /**
     * @return the start point for this PaintTool.
     */
    protected Point getStartPoint() {
        return myStartPoint;
    }
    
    @Override
    public void setEndPoint(final Point thePoint) {      
        myEndPoint = thePoint;
    }

    /**
     * @return the end point for this PaintTool.
     */
    protected Point getEndPoint() {
        return myEndPoint;
    }

}
