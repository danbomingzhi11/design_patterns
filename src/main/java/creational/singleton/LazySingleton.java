package creational.singleton;

public class LazySingleton {
    // volatile 解决重排序 以及 不可见性
    private static volatile LazySingleton lazySingleton = null;

    // 使用静态内部类实现 懒汉式单例模式
    public static class SingletonInstance {
        private final static LazySingleton SINGLETON = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        // 单层 if 会有线程安全问题
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }

        // 双层 if 解决 + Synchronized 解决
        if (lazySingleton == null) {
            synchronized (lazySingleton) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }

        return SingletonInstance.SINGLETON;
    }
}


