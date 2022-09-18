public class Main {
    public static void main(String[] args) {
        isMan(new Man("a"));
    }

    public static boolean isMan(Person person) {
        return switch (person) {
            case Man man -> true;
            case Women women -> false;
            case Transgender transgender -> transgender.isMan();
        };
    }
}
