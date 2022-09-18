package diff.enumdemo.singleton;

public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    /**
     * 传统懒汉模式
     */
    public static LazySingleton getInstanceA() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 进阶版懒汉模式
     */
    public static synchronized LazySingleton getInstanceB() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 升级版懒汉模式
     */
    public static LazySingleton getInstanceC() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 静态内部类实现饿汉模式
     * 延迟初始化占位类模式
     */
    private static class LazySingletonHolder {
        private static final LazySingleton INSTANCE = new LazySingleton();
    }
    public static LazySingleton getInstanceD() {
        return LazySingletonHolder.INSTANCE;
    }


    public void doSomeThing() {
        System.out.println("do something");
    }
}
