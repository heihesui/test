package upgrade.newswitch.sealed;


public record Rectangle(double length, double width) implements Shape {
    @Override
    public double area() {
        return length * width;
    }
}
