package patterns;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
//        Cat cat1 = new Cat1();
//        cat1.eat();
//        AbstractAnimal animal = new Dog();
        AnimalFactor animalFactor = new AnimalFactor();
        AbstractAnimal animal1 = animalFactor.animalFactor(cat);
        animal1.eat();
    }
}
