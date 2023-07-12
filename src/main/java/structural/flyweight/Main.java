package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        //下黑子
        Chess backChess1 = ChessFactory.getChess(Color.BLACK.color);
        backChess1.draw(2.0, 5.0);

        //下白子
        Chess whiteChess = ChessFactory.getChess(Color.WHITE.color);
        whiteChess.draw(3.0, 5.0);

        //下黑子
        Chess backChess2 = ChessFactory.getChess(Color.BLACK.color);
        backChess2.draw(2.0, 6.0);

        System.out.println(String.format("backChess1:%d | backChess2:%d | whiteChess:%d",
                backChess1.hashCode(), backChess2.hashCode(), whiteChess.hashCode()));
    }
}
