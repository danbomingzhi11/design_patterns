package behavioral.command;

public class CloseCommand implements Command{
    private Course course;

    public CloseCommand(Course course) {
        this.course = course;
    }

    @Override
    public void execute() {
        System.out.println(course.getCourseName() + "课程关闭");
    }
}
