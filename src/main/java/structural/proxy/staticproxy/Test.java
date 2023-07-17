package main.java.structural.proxy.staticproxy;

import main.java.structural.proxy.Person;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Time",10);

        PersonServicesStaticProxy proxy = new PersonServicesStaticProxy();
        proxy.savePerson(person);
    }
}
