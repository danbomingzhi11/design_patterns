package creational.builder;

// 建造者模式
public class Main {
    public static void main(String[] args) {
        creational.builder.Person person = new creational.builder.Person.PersonBuilder()
                .setName("小明")
                .setSex(1)
                .setAge(13)
                .setAddress("大连")
                .build();
        
    }
}
