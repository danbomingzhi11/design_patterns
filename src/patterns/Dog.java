package patterns;

public class Dog extends AbstractAnimal{
    Cat cat;

    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

}
