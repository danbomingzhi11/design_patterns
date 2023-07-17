package main.java.structural.proxy;

// 用户
public class Person {
    // 用户ID
    private String userId;
    // 主键ID
    private Integer personId;

    public Person() {
    }

    public Person(String userId, Integer routeId) {
        this.userId = userId;
        this.personId = routeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }
}
