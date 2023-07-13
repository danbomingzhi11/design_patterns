package creational.factory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.sql.Connection;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
//        // 组装 mysql 包装类
//        InfoProperties infoProperties = new InfoProperties(
//                "jdbc:mysql://localhost:3306/test",
//                "admin",
//                "admin");
//        // 模拟 mysql JDBC 连接2
//        MysqlConnectionImpl mysqlConnection = new MysqlConnectionImpl();
//        //建立连接
//        mysqlConnection.connect(infoProperties);
//
//        // But 不满足面向接口编程 版本迭代更改类名或者方法名程序不兼容
//
//        // 增加一个接口 and 简单工厂方法
//        try {
//            Connection connection = ConnectionSimpleFactory.getConnection("mysql", infoProperties);
//            connection.connect(infoProperties);
//        } catch (RuntimeException e) {
//            e.printStackTrace();
//        }
//
//        // 出现一个问题 简单工厂方法不易于扩展 可以使用反射 + 配置文件 (Spring 基本原理）
//        Connection connection = Driver.getConnection("src.main.java.creational.factory.MysqlConnectionImpl", infoProperties);

        // 但是创建这些类的过程不应该被暴露出来，应该让各个厂商各自在各自的Jar包中去创建自家的Connection对象

        // 使用DriverManager类 来统一管理连接
        creational.factory.InfoProperties infoProperties = new creational.factory.InfoProperties(
                "jdbc:mysql://81.70.181.205:3307/foodie",
                "root",
                "root");
        testJdbc("com.mysql.cj.jdbc.Driver", infoProperties);

        // 使用配置文件简化

    }

    // 测试JDBC
    private static void testJdbc(String type, InfoProperties info) {
        try {
            // 获取到Driver类 并 注册到DriverManager 容器中
            Class.forName(type);
            // 使用 DriverManager 建立连接
            Connection connection = DriverManager.getConnection(info.getUrl(), info.getUser(), info.getPassWard());
            // 创建Statement对象
            Statement statement = connection.createStatement();

            // 执行查询语句
            String query = "SELECT * FROM items";
            ResultSet resultSet = statement.executeQuery(query);

            // 处理查询结果集
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("item_name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // 关闭连接和资源
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 与配置文件相结合的JDBC
    private static void jdbcByProperties() throws IOException, ClassNotFoundException, SQLException {
        //1.加载配置文件
        InputStream in = InfoProperties.class.getClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(in);

        //2.读取配置信息
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = "com.mysql.cj.jdbc.Driver";

        //3.加载驱动
        Class.forName(driverClass);

        //4.获取连接
        Connection connection = DriverManager.getConnection(url, user, password);

        // 5.创建Statement对象
        Statement statement = connection.createStatement();

        // 6.执行查询语句
        String query = "SELECT * FROM items";
        ResultSet resultSet = statement.executeQuery(query);

        // 7.处理查询结果集
        while (resultSet.next()) {
            String id = resultSet.getString("id");
            String name = resultSet.getString("item_name");
            System.out.println("ID: " + id + ", Name: " + name);
        }

        // 8.关闭连接和资源
        resultSet.close();
        statement.close();
        connection.close();
        System.out.println(connection);
    }
}
