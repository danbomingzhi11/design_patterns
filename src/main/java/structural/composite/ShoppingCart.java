package structural.composite;

// 购物车接口
public interface ShoppingCart {
    public default void add(ShoppingCart shoppingCart){
        throw new UnsupportedOperationException("不支持添加操作");
    }

    public default void remove(ShoppingCart shoppingCart){
        throw new UnsupportedOperationException("不支持删除操作");
    }

    public default String getName(ShoppingCart shoppingCart){
        throw new UnsupportedOperationException("不支持获取名称操作");
    }

    public default double getPrice(ShoppingCart shoppingCart){
        throw new UnsupportedOperationException("不支持获取价格操作");
    }

    public default void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }
}
