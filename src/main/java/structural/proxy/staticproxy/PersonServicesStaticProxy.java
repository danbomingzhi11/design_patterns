package main.java.structural.proxy.staticproxy;

import main.java.structural.proxy.Person;
import main.java.structural.proxy.PersonDao;
import main.java.structural.proxy.PersonDaoImpl;

public class PersonServicesStaticProxy {
    Integer routerId;
    String  userId;

    PersonDao personDao = new PersonDaoImpl();
    public void savePerson(Person person) {
        preMethods(person);

        person.setPersonId(routerId);
        personDao.insert();

        endMethod();
    }

    private void preMethods(Person person) {
        System.out.println("执行前方法 before code");
        userId = person.getUserId();
        routerId = person.getPersonId() % 2;
        System.out.println("静态代理分配到【db"+routerId+"】处理数据");
    }

    private void  endMethod() {
        System.out.println("静态代理 after code");
    }
}
