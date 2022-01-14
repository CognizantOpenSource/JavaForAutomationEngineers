/**
 * NOTE: This Test class requires some lines to be uncommented when the Equilateral Triangle class is finished
 */
import org.testng.Assert;
import org.testng.annotations.Test;

public class EquilateralTriangleTest {
    /**
     * This test is for the 'Getters' and 'Setters'
     */
    @Test
    public void testTriangleValidGettersAndSetters() {
        double intendedBase = 8;

        EquilateralTriangle triangle = new EquilateralTriangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        triangle.setBase(intendedBase);
//        Assert.assertEquals(triangle.getBase(), intendedBase);
    }

    /**
     * This test is a negative test for the 'Getters' and 'Setters'
     */
    @Test
    public void testTriangleInvalidGettersAndSetters() {
        double intendedBase = -4;

        EquilateralTriangle triangle = new EquilateralTriangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        triangle.setBase(intendedBase);
//        Assert.assertEquals(triangle.getBase(), 0.0);
    }

    /**
     * This test is for the area
     */
    @Test
    public void testTriangleArea() {
        double base = 5;
        double height = Math.sqrt(3) * base / 2;
        EquilateralTriangle triangle = new EquilateralTriangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        triangle.setBase(base);
//        Assert.assertEquals(triangle.area(), (base * height)/2);
    }

    /**
     * This test is for the perimeter
     */
    @Test
    public void testTrianglePerimeter() {
        double base = 9;
        EquilateralTriangle triangle = new EquilateralTriangle();
        // TODO FOR HOMEWORK: Uncomment the lines below when EquilateralTriangle.java is complete
//        triangle.setBase(base);
//        Assert.assertEquals(triangle.perimeter(), 3 * base);
    }
}