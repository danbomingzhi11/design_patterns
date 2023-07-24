package structural.strategy;

public class PromotionActivity {
    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void exect() {
        promotionStrategy.doPromotion();
    }
}
