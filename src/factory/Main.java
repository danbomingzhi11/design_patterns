package factory;

public class Main {
    public static void main(String[] args) {
        // 组装 mysql 包装类
        InfoProperties infoProperties = new InfoProperties(
                "jdbc:mysql://localhost:3306/test",
                "admin",
                "admin");
        // 模拟 mysql JDBC 连接
        MysqlConnection mysqlConnection = new MysqlConnection(infoProperties);
        //建立连接
        mysqlConnection.connection();

        // But 不满足面向接口编程 版本迭代更改类名或者方法名程序不兼容

        // 增加一个接口 and 简单工厂方法
        try {
            Connection connection = ConnectionSimpleFactory.getConnection("mysql", infoProperties);
            connection.connection();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        // TODO: 出现一个问题 简单工厂方法不易于扩展 可以使用反射 + 配置文件 (Spring 基本原理）

        //
    }
}
