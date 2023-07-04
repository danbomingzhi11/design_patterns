package creational.patterns;

public class Main {
    // 入口函数
    public static void main(String[] args) {
        // 1.text
        // 2.
        Main.run(new Cat1());

    }

    private static void run(Animal animal) {
        animal.eat();
    }
//    private static void runCat(Cat cat) {
//        cat.eat();
//    }
//    private static void runDog(Dog dog) {
//        dog.eat();
//    }
}
