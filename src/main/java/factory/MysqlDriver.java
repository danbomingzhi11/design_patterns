package factory;

// Mysql 工厂
public class MysqlDriver implements Driver1{
    // 获取连接
    public Connection getConnection(InfoProperties info) {
        return new MysqlConnectionImpl();
    }
}
