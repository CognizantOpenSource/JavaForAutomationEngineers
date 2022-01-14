/**
 * TODO FOR HOMEWORK - ShapeFactory.java
 *      [ ] Uncomment any marked code in both CreateShape methods
 */
public class ShapeFactory {
    /**
     * The Shape Types | More info on enums can be found here LINK: https://www.w3schools.com/java/java_enums.asp
     */
    public enum Shapes { NONE, Square, Rectangle, EquilateralTriangle }

    /**
     * TODO FOR HOMEWORK: Uncomment the marked lines when both Rectangle.java and EquilateralTriangle.java are complete
     * Creates a shape object with the given length and height
     * @param shape The type of shape from the Shapes Enum
     * @param length The length of the shape
     * @param height The height of the shape
     * @return
     */
    public static BaseShape CreateShape(Shapes shape, double length, double height) {
        // Switches off the type of shape
        switch(shape) {
            // If the shape is a Square, it creates a square object
            case Square:
                // Checks if the length and height are the same, and throws and error if they aren't
                if (length != height) {
                    // NOTE: This is an example of a thrown custom exception for better error messages, this will be covered in length later
                    // LINK: https://rollbar.com/guides/java-throwing-exceptions/
                    throw new IllegalArgumentException("The length and height provided are NOT equal and a square requires both to match");
                }

                return new Square(length);

            // If the shape is a Rectangle, it creates a rectangle object
            case Rectangle:
                // TODO FOR HOMEWORK: Uncomment the lines below when Rectangle.java is complete
//                return new Rectangle(length, height);

            // If the shape is a EquilateralTriangle, it creates a equilateral triangle object
            case EquilateralTriangle:
                if (length != Math.sqrt(3) * length / 2) {
                    // NOTE: This is an example of a thrown custom exception for better error messages, this will be covered in length later
                    // LINK: https://rollbar.com/guides/java-throwing-exceptions/
                    throw new IllegalArgumentException("The provided height is NOT valid for an Equilateral Triangle, the height must be  Math.sqrt(3) * length / 2");
                }

                // TODO FOR HOMEWORK: Uncomment the line below when EquilateralTriangle.java is complete
//                return new EquilateralTriangle(length);

            // If the shape is not set return null instead of the shape object
            case NONE:
            default:
                return null;
        }
    }

    /**
     * TODO FOR HOMEWORK: Uncomment the marked lines when both Rectangle.java and EquilateralTriangle.java are complete
     * Creates a shape object with the given length and height
     * @param shape The type of shape from the Shapes Enum
     * @param length The length of the shape
     * @return
     */
    public static BaseShape CreateShape(Shapes shape, double length) {
        // Switches off the type of shape
        switch(shape) {
            // If the shape is a Square, it creates a square object
            case Square:
                return new Square(length);

            // If the shape is a Rectangle, it creates a rectangle object
            case Rectangle:
                throw new IllegalArgumentException("A rectangle requires both a length and a height, but only a length was provided");

            // If the shape is a EquilateralTriangle, it creates a equilateral triangle object
            case EquilateralTriangle:
                // TODO FOR HOMEWORK: Uncomment the line below when EquilateralTriangle.java is complete
//                return new EquilateralTriangle(length);

            // If the shape is not set return null instead of the shape object
            case NONE:
            default:
                return null;
        }
    }
}
