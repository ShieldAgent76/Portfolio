package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class RectangleTool extends AbstractPaintTool {

    @Override
    public Shape getShape() {
       
        final Point start = getStartPoint();
        final Rectangle2D.Double rectangle = new Rectangle2D.Double(start.getX(),start.getY(),20, 20);
//        final Point end = new Point(start.x + 20, start.y + 20);
//        circle.setFrameFromCenter(start, end);
        return rectangle;
    }

}
