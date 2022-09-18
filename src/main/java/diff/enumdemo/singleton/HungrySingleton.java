package diff.enumdemo.singleton;

public class HungrySingleton {
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    /**
     *传统饿汉模式
     */
    public static HungrySingleton getInstanceA() {
        return INSTANCE;
    }

    public void doSomeThing() {
        System.out.println("do something");
    }

}
