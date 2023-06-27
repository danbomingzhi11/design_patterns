package patterns;

public class AnimalFactor {
    public AbstractAnimal animalFactor(AbstractAnimal animal) {
        if (animal.getClass() == Cat.class) {
            return new Cat();
        }

        return new Dog();

    }
}
