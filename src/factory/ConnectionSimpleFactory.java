package factory;

// Connection 类 简单工厂方法
public class ConnectionSimpleFactory {
    public static Connection getConnection (String type, InfoProperties info) {
        if ("Mysql".equals(type)) {
            return new MysqlConnection(info);
        } else if ("Oracle".equals(type)) {
            return new OracleConnection(info);
        }
        throw new RuntimeException("sorry, this type is not support ");
    }
}
