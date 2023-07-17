package main.java.structural.decorator.v2;

public class FingerPieAddEgg extends FingerPieDecorator {
    public FingerPieAddEgg(FingerPie fingerPie) {
        super(fingerPie);
    }

    @Override
    public String make() {
        return super.make() + "加蛋";
    }

    @Override
    public Double price() {
        return super.price() + 1.0;
    }
}
