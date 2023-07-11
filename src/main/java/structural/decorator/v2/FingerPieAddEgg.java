package structural.decorator.v2;

public class FingerPieAddEgg extends FingerPieDecorator {
    public FingerPieAddEgg(FingerPie fingerPie) {
        super(fingerPie);
    }

    @Override
    String make() {
        return super.make() + "加蛋";
    }

    @Override
    Double price() {
        return super.price() + 1.0;
    }
}
