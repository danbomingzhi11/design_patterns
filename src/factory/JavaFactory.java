package factory;

// 简单工厂
public class JavaFactory extends AbstractFactory {

    @Override
    Run forRun() {
        return new JavaForRun();
    }

    @Override
    Jump forJump() {
        return new PythonForJump();
    }
}
