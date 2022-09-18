package diff.enumdemo.singleton;

public class HungrySinglon {
    private static final HungrySinglon INSTANCE = new HungrySinglon();

    private HungrySinglon() {

    }

    /**
     *传统饿汉模式
     */
    public static HungrySinglon getInstanceA() {
        return INSTANCE;
    }

    public static HungrySinglon getInstanceB() {
        return HungerSingletonHolder.INSTANCE;
    }

    public void doSomeThing() {
        System.out.println("do something");
    }

    /**
     * 静态内部类实现饿汉模式
     * 延迟初始化占位类模式
     */
    private static class HungerSingletonHolder {
        private static final HungrySinglon INSTANCE = new HungrySinglon();
    }

}
