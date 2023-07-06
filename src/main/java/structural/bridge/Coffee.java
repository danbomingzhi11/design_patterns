package structural.bridge;

// 咖啡抽象类
public abstract class Coffee {
    // 依赖 additive
    Additive additive;

    // 依赖 CoffeeType
    CoffeeType coffeeType;

    public Coffee(Additive additive, CoffeeType coffeeType) {
        this.additive = additive;
        this.coffeeType = coffeeType;
    }

    public Coffee(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    // 制作咖啡
    abstract Additive creatCoffee(int cont);

}
