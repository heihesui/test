package diff.enumdemo.singleton;

public enum EnumSingleton {
    /**
     * 单例模式
     * Effective Java 背书
     */
    INSTANCE;

    public void doSomeThing() {
        System.out.println("do something");
    }
}
