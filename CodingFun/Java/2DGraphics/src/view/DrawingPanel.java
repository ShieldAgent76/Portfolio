/*
 * TCSS 305 - Persistent graphics example 
 */

package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import tools.PaintTool;

/**
 * A panel for drawing shapes.
 * 
 * @author Alan Fowler (acfowler@uw.edu)
 * @version 1.3
 */
public class DrawingPanel extends JPanel {
    
    /** A generated serial version ID. */
    private static final long serialVersionUID = -7341017540338400176L;

    /** The preferred size of this panel. */
    private static final Dimension SIZE = new Dimension(600, 300);
    

    
    /** The PaintTool currently in use. */
    private PaintTool myCurrentTool;
    
    /** A collection of previously drawn shapes. */
    private final List<Shape> myPreviousShapes;



    /**
     * Initializes the panel.
     */
    public DrawingPanel() {
        super();
        myPreviousShapes = new ArrayList<>();
        ititalizePanel();
    }
    
    /**
     * Sets up the panel.
     */
    private void ititalizePanel() {
        setPreferredSize(SIZE);
        setBackground(Color.WHITE);
        
        // setup the mouse listener
        final MouseInputAdapter mouseHandler = new MyMouseHandler();
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }
    
    /**
     * Sets the current paint tool. 
     * @param theTool the PaintTool to use.
     */
    public void setCurrentTool(final PaintTool theTool) {
        myCurrentTool = theTool;
    }
    


    @Override
    public void paintComponent(final Graphics theGraphics) {
        super.paintComponent(theGraphics);
        final Graphics2D g2D = (Graphics2D) theGraphics;
        
        // Draw previous shapes
        for (final Shape s : myPreviousShapes) {
            g2D.draw(s);
        }
        
        g2D.draw(myCurrentTool.getShape());
    }
    
    

    // Inner Class
    /**
     * Listens for mouse events to draw on our panel.
     */
    private class MyMouseHandler extends MouseInputAdapter {

        @Override
        public void mousePressed(final MouseEvent theEvent) {
            myCurrentTool.setStartPoint(theEvent.getPoint());
            repaint(); // if we want to see the shape right away before dragging
        }

        @Override
        public void mouseDragged(final MouseEvent theEvent) {
            myCurrentTool.setEndPoint(theEvent.getPoint());
            repaint(); 
        }

        @Override
        public void mouseReleased(final MouseEvent theEvent) {
            myPreviousShapes.add(myCurrentTool.getShape());
            // No need to repaint() here. The Shape is already drawn.
        }
    }
    
    
    
}
