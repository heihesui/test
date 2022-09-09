package diff.passbyvalue;

public class PassByValue {
    public static void main(String[] args) {
        PassByValue passByValue = new PassByValue();

        passByValue.testBasic();

        passByValue.testArray();

        passByValue.testObject();
    }

    public void testBasic() {
        int num1 = 10;
        int num2 = 20;
        swapBasic(num1, num2);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public void testArray() {
        int[] arr = {1, 2, 3};
        System.out.println("数组的第一个数字是 " + arr[0]);
        change(arr);
        System.out.println("数组的第一个数字是 " + arr[0]);
    }

    public void testObject() {
        Person xiaoZhang = new Person("小张");
        Person xiaoLi = new Person("小李");
        swapPerson(xiaoZhang, xiaoLi);
        System.out.println("xiaoZhang = " + xiaoZhang.getName());
        System.out.println("xiaoLi = " + xiaoLi.getName());
    }

    public void swapBasic(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void change(int[] array) {
        array[0] = 0;
    }

    public void swapPerson(Person person1, Person person2) {
        Person temp = person1;
        person1 = person2;
        person2 = temp;
        System.out.println("person1 = " + person1.getName());
        System.out.println("person2 = " + person2.getName());
    }

    static class Person {
        private final String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
