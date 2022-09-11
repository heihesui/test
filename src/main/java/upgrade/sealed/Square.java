package upgrade.sealed;

public record Square(double side) implements Shape {
    @Override
    public double area() {
        return side * side;
    }
}