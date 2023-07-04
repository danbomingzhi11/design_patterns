package creational.factory;

public class Driver {
    public static Connection getConnection(String type, InfoProperties info) {
        try {
            // 获取到类的元信息
            Class<?> clz = Class.forName(type);
            // 通过元信息创建实例
            Connection connection = (Connection) clz.newInstance();
            // 通过实例调用方法
            connection.connect(info);
            // 返回语句
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void getProperties() {
        // 获取配置文件中的内容 用户无需修改代码
    }
}
