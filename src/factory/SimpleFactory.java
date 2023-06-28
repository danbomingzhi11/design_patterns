package factory;

public class SimpleFactory {
    public Run exc(String str) {
        if (str.equals("Java")) {
            return new JavaForRun();
        }
        if (str.equals("Python")) {
            return new PythonForRun();
        }

        return null;
    }
}
