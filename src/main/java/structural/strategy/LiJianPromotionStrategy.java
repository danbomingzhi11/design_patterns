package structural.strategy;

public class LiJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("恭喜您获得立减50元权限");
    }
}
