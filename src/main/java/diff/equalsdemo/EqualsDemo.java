package diff.equalsdemo;

import java.math.BigDecimal;

public class EqualsDemo {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = 100;
        Integer num3 = 100;

        System.out.println("num1 == num2 :" + (num1 == num2));
        System.out.println("num1 == num3 :" + (num1 == num3));
        System.out.println("num2 == num3 : " + (num2 == num3));

        int num11 = 200;
        Integer num22 = 200;
        Integer num33 = 200;

        System.out.println("num11 == num22 :" + (num11 == num22));
        System.out.println("num11 == num33 :" + (num11 == num33));
        System.out.println("num22 == num33 : " + (num22 == num33));

        int num111 = 100;
        Integer num222 = 100;
        Integer num333 = new Integer(100);

        System.out.println("num111 == num222 :" + (num111 == num222));
        System.out.println("num111 == num333 :" + (num111 == num333));
        System.out.println("num222 == num333 : " + (num222 == num333));

        Integer i1 = 33;
        Integer i2 = 33;
        System.out.println(i1 == i2);

        Float i11 = 333f;
        Float i22 = 333f;
        System.out.println(i11 == i22);

        Double i3 = 1.2;
        Double i4 = 1.2;
        System.out.println(i3 == i4);

        String aa = "ab";
        String bb = "ab";
        System.out.println(aa==bb);

        String str1 = new StringBuilder("ja").append("va").toString();
        System.out.println(str1.intern() == str1);
        String str2 = "java";
        System.out.println(str2.intern() == str2);
        String str3 = new StringBuilder("java").toString();
        System.out.println(str3.intern() == str3);
        String str4 = "java";
        System.out.println("java" == str4);

        BigDecimal bigDecimal1 = new BigDecimal("1");
        BigDecimal bigDecimal2 = new BigDecimal("1.0000");
        System.out.println(bigDecimal2 == bigDecimal1);
        System.out.println(bigDecimal2.equals(bigDecimal1));
        System.out.println(bigDecimal2.compareTo(bigDecimal1));
    }
}
