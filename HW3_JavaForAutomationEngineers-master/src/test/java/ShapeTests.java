/**
 * NOTE: Nothing needs to be done to this file it is already complete.
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShapeTests {
    /**
     * Generically tests the 'getter' methods for each shape using the Shape Factory
     */
    @Test
    public void GettersTest() {
        // Initializes a generic shape object that will hold our square, rectangle and triangle
        BaseShape shape = null;

        // The desired length and height used for testing
        double length = 4;
        double rectangleHeight = 7;

        // Creates a Square and validates the 'Getters' using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.Square, length);
        Assert.assertEquals(shape.getShapeName().toLowerCase(), "square");
        Assert.assertEquals(shape.getLength(), length);
        Assert.assertEquals(shape.getHeight(), length);

        // Creates a Rectangle and validates the 'Getters' using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.Rectangle, length, rectangleHeight);
        Assert.assertEquals(shape.getShapeName().toLowerCase(), "rectangle");
        Assert.assertEquals(shape.getLength(), length);
        Assert.assertEquals(shape.getHeight(), rectangleHeight);

        // Creates a Equilateral Triangle and validates the 'Getters' using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.EquilateralTriangle, length);
        Assert.assertEquals(shape.getShapeName().toLowerCase().replaceAll(" ", ""), "equilateraltriangle");
        Assert.assertEquals(shape.getLength(), length);
        Assert.assertEquals(shape.getHeight(), Math.sqrt(3) * length / 2);
    }

    /**
     * Generically tests the area method for each shape using the Shape Factory
     */
    @Test
    public void AreaTest() {
        // Initializes a generic shape object that will hold our square, rectangle and triangle
        BaseShape shape = null;

        // The desired length and height used for testing
        double length = 4;
        double rectangleHeight = 7;

        // Creates a Square and validates the area using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.Square, length);
        Assert.assertEquals(shape.area(), length * length);

        // Creates a Rectangle and validates the area using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.Rectangle, length, rectangleHeight);
        Assert.assertEquals(shape.area(), length * rectangleHeight);

        // Creates a Equilateral Triangle and validates the area using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.EquilateralTriangle, length);
        Assert.assertEquals(shape.area(),  length * Math.sqrt(3) * length / 4);
    }

    /**
     * Generically tests the perimeter method for each shape using the Shape Factory
     */
    @Test
    public void PerimeterTest() {
        // Initializes a generic shape object that will hold our square, rectangle and triangle
        BaseShape shape = null;

        // The desired length and height used for testing
        double length = 5;
        double rectangleHeight = 7;

        // Creates a Square and validates the perimeter using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.Square, length);
        Assert.assertEquals(shape.perimeter(), 4 * length);

        // Creates a Rectangle and validates the perimeter using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.Rectangle, length, rectangleHeight);
        Assert.assertEquals(shape.perimeter(), 2 * length + 2 * rectangleHeight);

        // Creates a Equilateral Triangle and validates the perimeter using the ShapeFactory
        shape = ShapeFactory.CreateShape(ShapeFactory.Shapes.EquilateralTriangle, length);
        Assert.assertEquals(shape.perimeter(), 3 * length);
    }
}
