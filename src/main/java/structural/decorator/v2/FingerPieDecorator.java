package structural.decorator.v2;

public class FingerPieDecorator extends FingerPie{
    FingerPie fingerPie;

    public FingerPieDecorator(FingerPie fingerPie) {
        this.fingerPie = fingerPie;
    }

    @Override
    String make() {
        return this.fingerPie.make();
    }

    @Override
    Double price() {
        return this.fingerPie.price();
    }
}
