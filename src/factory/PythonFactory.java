package factory;

public class PythonFactory extends AbstractFactory{

    @Override
    Run forRun() {
        return new PythonForRun();
    }
}
