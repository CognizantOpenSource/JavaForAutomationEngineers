/**
 * TODO FOR HOMEWORK - BaseShape.java
 *      [ ] Create a valid and logical constructor
 *      [ ] Create all logical 'Setter' method and have each method's 'scope' correct
 */
public abstract class BaseShape {
    /**
     * The name of the shape
     */
    private String shapeName;

    /**
     * The length of a shape
     */
    private double length;

    /**
     * The height of the shape
     */
    private double height;

    /**
     * TODO FOR HOMEWORK: Write a valid constructor for a BaseShape that uses each of the following parameters
     * Creates an instance of the BaseShape class
     * @param shapeName The name of the shape
     * @param length The length of the shape
     * @param height The height of the shape
     */
    public BaseShape(String shapeName, double length, double height) {
    }

    /**
     * Gets the shape name
     * @return The shape name
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * Gets the length
     * @return The length
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the height
     * @return The height
     */
    public double getHeight() {
        return height;
    }

    // TODO FOR HOMEWORK: Create Setters for each of the above properties of BaseShape and make sure the scope is correct

    /**
     * Returns the area of the shape
     * @return The area
     */
    public double area() {
        return this.length * this.height;
    }

    /**
     * Returns the perimeter of the shape
     * @return The perimeter
     */
    public double perimeter() {
        return 2 * this.length + 2 * this.height;
    }

    /**
     * DEBUG METHOD: Prints out both the area and the perimeter
     */
    protected void DEBUG_PrintOutAreaAndPerimeter() {
        // Calculates the area and perimeter of the shape
        double area = this.area();
        double perimeter = this.perimeter();

        // NOTE: The below is an unformatted string and is not fully covered in this course yet. But we included it as
        //       it is very helpful in printing messages to the user. Here is a resource on String.format
        // LINK: https://www.javatpoint.com/java-string-format
        String unformattedPrintout = "A %s with a length of %.3f and a height of %.3f has the following %s - %.3f";

        // Prints out the area and perimeter of the shape
        System.out.println(String.format(unformattedPrintout, this.getShapeName(), this.getLength(), this.getHeight(), "area", area));
        System.out.println(String.format(unformattedPrintout, this.getShapeName(), this.getLength(), this.getHeight(), "perimeter", perimeter));
    }
}
