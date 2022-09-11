package upgrade.sealed;

public sealed interface Shape permits Circle, Rectangle, Square {

    static boolean isSquare(Shape shape) {
        return shape instanceof Square;
    }

    double area();

}