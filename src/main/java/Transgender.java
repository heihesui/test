public final class Transgender extends Person {
    public Transgender(String name, boolean isMan) {
        super(name);
        this.isMan = isMan;
    }

    private boolean isMan;

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }
}
