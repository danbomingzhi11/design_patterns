package structural.strategy;

public class ManJianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减策略 满200-10");
    }
}
