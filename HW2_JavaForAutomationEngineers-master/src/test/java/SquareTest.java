/**
 * NOTE: This Test class is already complete and should be used as reference for the other test cases
 */

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {
    /**
     * This test is for the 'Getters' and 'Setters'
     */
    @Test
    public void testSquareValidGettersAndSetters() {
        double intendedSide = 7;

        Square square = new Square();
        square.setSide(intendedSide);
        Assert.assertEquals(square.getSide(), intendedSide);
    }

    /**
     * This test is a negative test for the 'Getters' and 'Setters'
     */
    @Test
    public void testSquareInvalidGettersAndSetters() {
        int intendedSide = -7;

        Square square = new Square();
        square.setSide(intendedSide);
        Assert.assertEquals(square.getSide(), 0.0);
    }

    /**
     * This test is for the area
     */
    @Test
    public void testSquareArea() {
        double sideLength = 4;
        Square square = new Square();
        square.setSide(sideLength);
        Assert.assertEquals(square.area(), sideLength * sideLength);
    }

    /**
     * This test is for the perimeter
     */
    @Test
    public void testSquarePerimeter() {
        double sideLength = 5;
        Square square = new Square();
        square.setSide(sideLength);
        Assert.assertEquals(square.perimeter(), 4 * sideLength);
    }
}