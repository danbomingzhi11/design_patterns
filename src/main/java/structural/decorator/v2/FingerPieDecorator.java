package main.java.structural.decorator.v2;

public class FingerPieDecorator extends FingerPie{
    FingerPie fingerPie;

    public FingerPieDecorator(FingerPie fingerPie) {
        this.fingerPie = fingerPie;
    }

    @Override
    public String make() {
        return this.fingerPie.make();
    }

    @Override
    public Double price() {
        return this.fingerPie.price();
    }
}
