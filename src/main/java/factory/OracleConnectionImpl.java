package factory;

// Oracle 连接类
public class OracleConnectionImpl implements Connection {

    // Oracle 连接方法

    public Boolean connect(InfoProperties info) {
        System.out.println("模拟 Oracle 进行连接");
        return true;
    }
}
