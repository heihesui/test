public sealed abstract class Person permits Man, Women, Transgender {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
