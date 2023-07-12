package structural.flyweight;

// 白棋
public class WhiteChess extends Chess {

    private final String color = Color.WHITE.color;

    // 落子
    @Override
    void draw(Double x, Double y) {
        System.out.println(String.format("%s 落子坐标 %f %f",
                color, x, y));
    }
}
