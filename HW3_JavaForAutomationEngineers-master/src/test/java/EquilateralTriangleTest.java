/**
 * NOTE: This Test class requires some lines to be uncommented when the EquilateralTriangle class is finished
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquilateralTriangleTest {
    /**
     * This test is for the 'Getters'
     */
    @Test
    public void testGetters() {
        double length = 7;

        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        EquilateralTriangle triangle = new EquilateralTriangle(length, height);
//        Assert.assertEquals(triangle.getLength(), length);
//        Assert.assertEquals(triangle.getHeight(), Math.sqrt(3) * length / 2);
    }

    /**
     * This test is for the area
     */
    @Test
    public void testTriangleArea() {
        double length = 4;
        double height = Math.sqrt(3) * length / 2;

        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        EquilateralTriangle triangle = new EquilateralTriangle(length);
//        Assert.assertEquals(triangle.area(), length * height / 2);
    }

    /**
     * This test is for the perimeter
     */
    @Test
    public void testRectanglePerimeter() {
        double length = 5;
        double height = Math.sqrt(3) * length / 2;

        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        EquilateralTriangle triangle = new EquilateralTriangle(length);
//        Assert.assertEquals(triangle.perimeter(), 3 * length);
    }
}