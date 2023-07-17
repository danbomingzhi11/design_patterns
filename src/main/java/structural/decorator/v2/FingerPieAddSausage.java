package main.java.structural.decorator.v2;

public class FingerPieAddSausage extends FingerPieDecorator {
    public FingerPieAddSausage(FingerPie fingerPie) {
        super(fingerPie);
    }

    @Override
    public String make() {
        return super.make() + "加肠";
    }

    @Override
    public Double price() {
        return super.price() + 1.0;
    }
}
