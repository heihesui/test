package equalsdemo;

public class EqualsDemo {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(100);
        Integer num3 = new Integer(100);

        System.out.println("num1 == num2 :" + (num1 == num2));
        System.out.println("num1 == num3 :" + (num1 == num3));
        System.out.println("num2 == num3 : " + (num2 == num3));

        int num11 = 200;
        Integer num22 = Integer.valueOf(200);
        Integer num33 = new Integer(200);

        System.out.println("num11 == num22 :" + (num11 == num22));
        System.out.println("num11 == num33 :" + (num11 == num33));
        System.out.println("num22 == num33 : " + (num22 == num33));
    }
}
