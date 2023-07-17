package behavioral.command;

public class OpenCommand implements Command{
    private Course course;

    public OpenCommand(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
        System.out.println(course.getCourseName() + "课程开启");
    }
}
