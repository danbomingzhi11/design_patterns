package structural.templatementhod;

public class JavaCourse extends Course {

    private boolean writeArticle;

    public JavaCourse(boolean writeArticle) {
        this.writeArticle = writeArticle;
    }

    @Override
    protected boolean writeArticle() {
        return writeArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("编制Java课程");
    }
}
