import upgrade.sealed.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        Circle circle1 = new Circle(1);
        System.out.println(circle1 == circle);
        System.out.println(circle1.equals(circle));
    }
}
