package upgrade.record.improve;


public interface Shape {

    static boolean isSquare(Shape shape) {
        /*if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            return (rect.length == rect.width);
        }*/

        if (shape instanceof Rectangle rectangle) {
            return rectangle.length() == rectangle.width();
        }
        return shape instanceof Square;
    }

    double area();

}