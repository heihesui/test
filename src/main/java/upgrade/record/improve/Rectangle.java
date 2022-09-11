package upgrade.record.improve;

public record Rectangle(double length, double width) implements Shape {
    @Override
    public double area() {
        return length * width;
    }
}
