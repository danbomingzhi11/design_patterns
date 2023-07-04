package factory;
// Oracle 工厂
public class OracleDriver implements Driver1{
    // 获取连接
    public Connection getConnection(InfoProperties info) {
        return new OracleConnectionImpl();
    }
}
