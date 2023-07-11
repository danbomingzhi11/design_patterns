package structural.decorator.v2;

public class FingerPieBody extends FingerPie{
    @Override
    String make() {
        return "手抓饼";
    }

    @Override
    Double price() {
        return 5.0;
    }
}
