package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// 工厂
public class ChessFactory {
    private static final Map<String, Chess> map = new HashMap<>();

    public static Chess getChess(String color) {
        Chess chess = map.get(color);
        if (chess == null) {
            map.put(color == "白色" ? "白色" : "黑色",
                    chess = (color == "黑色" ? new BlackChess()
                            : new WhiteChess()));
        }
        
        return chess;
    }
}