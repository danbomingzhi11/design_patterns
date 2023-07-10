package structural.composite;

// 商品类
public class commodity implements ShoppingCart {
    // 商品名
    private String name;

    // 商品价格
    private Double price;

    @Override
    public String getName(ShoppingCart shoppingCart) {
        return null;
    }

    @Override
    public double getPrice(ShoppingCart shoppingCart) {
        return 0;
    }

    @Override
    public void print() {
        System.out.println(name + "价格为: " + price);
    }
}
