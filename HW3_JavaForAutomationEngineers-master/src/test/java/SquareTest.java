/**
 * NOTE: This Test class is already complete and should be used as reference for the other test cases
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
    /**
     * This test is for the 'Getters'
     */
    @Test
    public void testGetters() {
        double sideLength = 7;

        Square square = new Square(sideLength);
        Assert.assertEquals(square.getLength(), sideLength);
        Assert.assertEquals(square.getHeight(), sideLength);
    }

    /**
     * This test is for the area
     */
    @Test
    public void testSquareArea() {
        double sideLength = 4;

        Square square = new Square(sideLength);
        Assert.assertEquals(square.area(), sideLength * sideLength);
    }

    /**
     * This test is for the perimeter
     */
    @Test
    public void testSquarePerimeter() {
        double sideLength = 5;

        Square square = new Square(sideLength);
        Assert.assertEquals(square.perimeter(), 4 * sideLength);
    }
}