package upgrade.sealed;


public record Rectangle(double length, double width) implements Shape {
    @Override
    public double area() {
        return length * width;
    }
}
