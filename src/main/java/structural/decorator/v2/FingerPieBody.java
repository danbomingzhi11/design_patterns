package main.java.structural.decorator.v2;

public class FingerPieBody extends FingerPie{
    @Override
    public String make() {
        return "手抓饼";
    }

    @Override
    public Double price() {
        return 5.0;
    }
}
