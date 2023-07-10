package structural.composite;

import java.util.ArrayList;
import java.util.List;

// 购物类
public class Shopping implements ShoppingCart{
    // 等级
    private Integer level;

    // 描述
    private String name;

    // 核心
    private final List<ShoppingCart> list = new ArrayList<>();

    @Override
    public void add(ShoppingCart shoppingCart) {
        list.add(shoppingCart);
    }

    @Override
    public void remove(ShoppingCart shoppingCart) {
        list.remove(shoppingCart);
    }
}
