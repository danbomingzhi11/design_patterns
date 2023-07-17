package main.java.structural.decorator.v1;

import main.java.structural.decorator.v2.FingerPie;

public class FingerPieAddSausage extends FingerPie {
    @Override
    public String make() {
        return "加肠";
    }

    @Override
    public Double price() {
        return  1.0;
    }
}
