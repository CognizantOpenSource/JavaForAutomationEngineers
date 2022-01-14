/**
 * NOTE: This Test class requires some lines to be uncommented when the Rectangle class is finished
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class RectangleTest {
    /**
     * This test is for the 'Getters'
     */
    @Test
    public void testGetters() {
        double length = 7;
        double height = 2;

        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        Rectangle rectangle = new Rectangle(length, height);
//        Assert.assertEquals(rectangle.getLength(), length);
//        Assert.assertEquals(rectangle.getHeight(), height);
    }

    /**
     * This test is for the area
     */
    @Test
    public void testRectangleArea() {
        double length = 4;
        double height = 3;

        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        Rectangle rectangle = new Rectangle(length, height);
//        Assert.assertEquals(rectangle.area(), length * height);
    }

    /**
     * This test is for the perimeter
     */
    @Test
    public void testRectanglePerimeter() {
        double length = 5;
        double height = 7;

        // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//        Rectangle rectangle = new Rectangle(length, height);
//        Assert.assertEquals(rectangle.perimeter(), 2 * length + 2 * height);
    }
}