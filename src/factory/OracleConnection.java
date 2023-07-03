package factory;

// Oracle 连接类
public class OracleConnection implements Connection {
    // InfoProperties 类型变量
    private InfoProperties info;

    public OracleConnection() {
    }

    public OracleConnection(InfoProperties info) {
        this.info = info;
    }

    // Oracle 连接方法
    @Override
    public Boolean connection() {
        System.out.println("模拟 Oracle 进行连接");
        return true;
    }
}
