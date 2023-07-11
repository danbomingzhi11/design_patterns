package structural.decorator.v2;

// 妙啊
public class Main {
    public static void main(String[] args) {
        // 太妙了
        FingerPie fingerPie = new FingerPieBody();
        fingerPie = new FingerPieAddSausage(fingerPie);
        fingerPie = new FingerPieAddEgg(fingerPie);

        System.out.println(fingerPie.make() + " 总价格 " + fingerPie.price());
    }
}
