package structural.adapter;

public class Main {
    public static void main(String[] args) {
        // 假设最高能承载 5伏特电力 所以需要适配器
        ElectricalAdapter electricalAdapter = new ElectricalAdapter();
        electricalAdapter.adapter();
    }
}
