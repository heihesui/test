package upgrade.record.immute;

public final class Square implements Shape {
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
