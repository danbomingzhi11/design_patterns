package factory;

// Mysql JDBC 连接类
public class MysqlConnectionImpl implements Connection{

    public Boolean connect(InfoProperties info) {
        // 模拟连接请求
        System.out.println("处理 Mysql 连接逻辑");
        return true;
    }


}
