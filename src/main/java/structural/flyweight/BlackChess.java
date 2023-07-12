package structural.flyweight;

// 黑棋
public class BlackChess extends Chess {

    private final String color = Color.BLACK.color;


    // 落子
    @Override
    void draw(Double x, Double y) {
        System.out.println(String.format("%s 落子坐标 %f %f",
                color, x, y));
    }
}
