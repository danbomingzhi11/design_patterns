package creational.singleton;

// 懒汉单例模式
public class HungrySingleton {
    // 静态变量 实现单例
    //private static Hungry hungry = new Hungry();

    // 常量实现单例
    //private static final Hungry HUNGRY = new Hungry();

    // 静态语句块实现单例
    private static HungrySingleton hungrySingleton;
    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
