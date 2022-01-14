/**
 * NOTE: This Test class requires some lines to be uncommented when the Rectangle class is finished
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
    /**
     * This test is for the 'Getters' and 'Setters'
     */
    @Test
    public void testRectangleValidGettersAndSetters() {
        double intendedWidth = 7;
        double intendedLength = 5;

        Rectangle rectangle = new Rectangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        rectangle.setWidth(intendedWidth);
//        rectangle.setLength(intendedLength);
        rectangle.getWidth();
        rectangle.getLength();
        Assert.assertEquals(rectangle.getWidth(), intendedWidth);
        Assert.assertEquals(rectangle.getLength(), intendedLength);
    }

    /**
     * This test is a negative test for the 'Getters' and 'Setters'
     */
    @Test
    public void testRectangleInvalidGettersAndSetters() {
        double intendedWidth = -3;
        double intendedLength = -4;

        Rectangle rectangle = new Rectangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        rectangle.setWidth(intendedWidth);
//        rectangle.setLength(intendedLength);
        rectangle.getWidth();
        rectangle.getLength();
        Assert.assertEquals(rectangle.getWidth(), 0.0);
        Assert.assertEquals(rectangle.getLength(), 0.0);
    }

    /**
     * This test is for the area
     */
    @Test
    public void testRectangleArea() {
        double width = 7;
        double length = 5;
        Rectangle rectangle = new Rectangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        rectangle.setWidth(width);
//        rectangle.setLength(length);
//        Assert.assertEquals(rectangle.area(), width * length);
    }

    /**
     * This test is for the perimeter
     */
    @Test
    public void testRectanglePerimeter() {
        double width = 2;
        double length = 9;
        Rectangle rectangle = new Rectangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        rectangle.setWidth(width);
//        rectangle.setLength(length);
//        Assert.assertEquals(rectangle.perimeter(), 2 * width + 2 * length);
    }
}