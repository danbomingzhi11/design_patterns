package factory;

public class Main {
    public static void main(String[] args) {
        // 假设一个业务场景 游戏NPC
        // run
//        JavaForRun java = new JavaForRun();
//        java.exe();

        SimpleFactory simpleFactory = new SimpleFactory();
        Run run = simpleFactory.exc("Java");
        run.exe();
    }
}
