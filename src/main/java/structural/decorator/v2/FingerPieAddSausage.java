package structural.decorator.v2;

public class FingerPieAddSausage extends FingerPieDecorator{
    public FingerPieAddSausage(FingerPie fingerPie) {
        super(fingerPie);
    }

    @Override
    String make() {
        return super.make() + "加肠";
    }

    @Override
    Double price() {
        return super.price() + 1.0;
    }
}
