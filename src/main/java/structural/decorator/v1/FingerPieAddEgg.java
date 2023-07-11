package structural.decorator.v1;

public class FingerPieAddEgg extends FingerPie{
    @Override
    public String make() {
        return super.make() + "加蛋";
    }

    @Override
    public Double price() {
        return super.price() + 1.0;
    }
}
