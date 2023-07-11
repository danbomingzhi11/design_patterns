package structural.decorator.v1;

public class FingerPieAddSausage extends FingerPie{
    @Override
    public String make() {
        return super.make() + "加肠";
    }

    @Override
    public Double price() {
        return super.price() + 1.0;
    }
}
