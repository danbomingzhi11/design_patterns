package structural.strategy;

import java.util.HashMap;

public class PromotionStrategyFactory {
    private static final HashMap<String ,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap();
    private static final PromotionStrategy emptyPromotionStrategy = new EmptyPromotionStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());

    }

    private interface PromotionKey {
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy =  PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? emptyPromotionStrategy : promotionStrategy;
    }
}
