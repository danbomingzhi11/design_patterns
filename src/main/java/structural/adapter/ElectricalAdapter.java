package structural.adapter;

public class ElectricalAdapter {
    // 依赖
    V12 v12 = new V12();
    V5 V5 = new V5();

    public void adapter() {
        v12.voltage();
    }
}
