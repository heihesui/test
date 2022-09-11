package diff.enumdemo.singleton;

public class LazySingleteon {
    private static LazySingleteon instance = null;

    private LazySingleteon() {

    }

    /**
     * 1、适用于单线程环境
     */
    public static LazySingleteon getInstanceA() {
        if (null == instance) {
            instance = new LazySingleteon();
        }
        return instance;
    }

    /**
     * 2、适用于多线程环境，但是效率不高
     */
    public static synchronized LazySingleteon getInstanceB() {
        if (instance == null) {
            instance = new LazySingleteon();
        }
        return instance;
    }

    /**
     * 3、双重检查加锁
     */
    public static LazySingleteon getInstanceC() {
        if (instance == null) {
            synchronized (LazySingleteon.class) {
                if (instance == null) {
                    instance = new LazySingleteon();
                }
            }
        }
        return instance;
    }


    public void doSomeThing() {
        System.out.println("do something");
    }
}
