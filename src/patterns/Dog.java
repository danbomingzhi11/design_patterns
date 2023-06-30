package patterns;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("狗吃狗粮");

    }
}
