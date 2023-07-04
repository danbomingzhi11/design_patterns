package factory;

// 连接包装类
public class InfoProperties {
    // url
    private String url;

    // user 账号
    private String user;

    // 密码 password
    private String passWard;

    public InfoProperties(String url, String user, String passWard) {
        this.url = url;
        this.user = user;
        this.passWard = passWard;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassWard() {
        return passWard;
    }

    public void setPassWard(String passWard) {
        this.passWard = passWard;
    }
}
