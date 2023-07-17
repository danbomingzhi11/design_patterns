package main.java.structural.proxy;

public class PersonDaoImpl implements PersonDao{
    @Override
    public void select() {
        System.out.println("执行查询语句");
    }

    @Override
    public void insert() {
        System.out.println("执行插入逻辑");
    }
}
