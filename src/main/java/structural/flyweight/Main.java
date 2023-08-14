package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        //下黑子
        structural.flyweight.Chess backChess1 = structural.flyweight.ChessFactory.getChess(Color.BLACK.color);
        backChess1.draw(2.0, 5.0);

        //下白子
        //
        structural.flyweight.Chess whiteChess = structural.flyweight.ChessFactory.getChess(Color.WHITE.color);
        whiteChess.draw(3.0, 5.0);

        //下黑子
        structural.flyweight.Chess backChess2 = structural.flyweight.ChessFactory.getChess(Color.BLACK.color);
        backChess2.draw(2.0, 6.0);
        
        System.out.println(String.format("backChess1:%d | backChess2:%d | whiteChess:%d",
                backChess1.hashCode(), backChess2.hashCode(), whiteChess.hashCode()));
    }
}
