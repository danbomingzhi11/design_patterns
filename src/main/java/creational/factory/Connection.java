package creational.factory;

// 连接类
public interface Connection {
    // 抽象方法
    abstract Boolean connect(InfoProperties info);
}