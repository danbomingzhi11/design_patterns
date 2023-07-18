package behavioral.command;

import java.util.ArrayList;
import java.util.List;

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
