package diff.enumdemo.singleton;

public class HungrySinglon {
    private static final HungrySinglon instance = new HungrySinglon();

    private HungrySinglon() {

    }

    /**
     * 传统饿汉模式
     * @return
     */
    public static HungrySinglon getInstanceA() {
        return instance;
    }

    /**
     * 静态内部类实现饿汉模式
     * 延迟初始化占位类模式
     */
    private static class HungerSingletonHolder{
        private static final HungrySinglon instance = new HungrySinglon();
    }
    public static HungrySinglon getInstanceB(){
        return HungerSingletonHolder.instance;
    }

}
