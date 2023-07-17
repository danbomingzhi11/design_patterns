package main.java.structural.bridge;

// 大杯咖啡
public class LargerCoffee extends Coffee{
    public LargerCoffee(Additive additive, CoffeeType coffeeType) {
        super(additive, coffeeType);
    }

    public LargerCoffee(CoffeeType coffeeType) {
        super(coffeeType);
    }

    // 制作大杯咖啡
    @Override
    Additive creatCoffee(int cont) {
        System.out.print(String.format("制作 %s杯 大杯 %s ", cont, coffeeType.create()));
        return additive;
    }
}
