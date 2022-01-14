/**
 * NOTE: Nothing needs to be done to this file it is already complete. Use it as reference
 */
public class Square extends BaseShape {
    /**
     * Creates an instance of the Rectangle class
     * @param length The length of the square
     */
    public Square(double length) {
        // Calls the base constructor and sets the height equal to the length since it's a square
        super("Square", length, length);
    }

    /**
     * The main method for the Square class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        Square square = new Square(5);
        square.DEBUG_PrintOutAreaAndPerimeter();
    }
}