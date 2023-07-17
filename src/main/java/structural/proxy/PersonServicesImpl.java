package main.java.structural.proxy;

import main.java.structural.proxy.PersonServices;

public class PersonServicesImpl implements PersonServices {
    @Override
    public void select() {
        System.out.println("执行查询逻辑");
    }

    @Override
    public void insert() {
        System.out.println("执行插入逻辑");
    }
}
