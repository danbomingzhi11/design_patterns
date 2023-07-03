package factory;

// Mysql JDBC 连接类
public class MysqlConnection implements Connection{
    // InfoProperties 类型变量
    private InfoProperties info;

    public MysqlConnection(InfoProperties info) {
        this.info = info;
    }

    public Boolean connection() {
        // 模拟连接请求
        System.out.println("处理 Mysql 连接逻辑");
//        return new Random().nextBoolean() ? true : false;
        return true;
    }


}
