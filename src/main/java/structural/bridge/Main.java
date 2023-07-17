package main.java.structural.bridge;

public class Main {
    public static void main(String[] args) {
        // 开始制作
        CoffeeType americano = new Americano();

        Additive milk = new AddMilk();

        new LargerCoffee(milk, americano)
                .creatCoffee(2)
                .addSomeThing();
    }
}
