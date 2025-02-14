import java.awt.geom.*; // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import java.util.concurrent.TimeUnit;

import gpdraw.*; // for DrawingTool


public class IrregularPolygon {
    private ArrayList<Point2D.Double> myPolygon = new ArrayList<Point2D.Double>();

    // constructor
    public IrregularPolygon() {}

    // public methods
    public void add(Point2D.Double aPoint)
    {
        // TODO: Add a point to the IrregularPolygon.
        myPolygon.add(aPoint)
    }

    public double perimeter() {
        // TODO: Calculate the perimeter.
        return 3.14;
    }

    public double area() {
        // TODO: Calculate the area.
        return 0.0;
    }

    public void draw()
    {
        // Wrap the DrawingTool in a try/catch to allow development without need for graphics.
        try {
            // TODO: Draw the polygon.
            // Documents: https://pavao.org/compsci/gpdraw/html/gpdraw/DrawingTool.html
            DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
            pen.move(50, 50);
            Point2D.Double first = myPolygon.get(0);
            pen.up();
            pen.move(first.getX(), first.getY());
            pen.down();
            for (int i = 1; i < myPolygon.size(); i++) {
                Point2D.Double after = myPolygon.get(i);
                pen.move(after.getX(), after.getY());
            }
        } catch (java.awt.HeadlessException e) {
            System.out.println("Exception: No graphics support available.");
        }
    }
}
