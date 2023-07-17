package behavioral.command;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setCourseName("wyf");

        Command openCommand = new OpenCommand(course);
        Command closeCommand = new CloseCommand(course);

        Staff staff = new Staff();
        staff.addCommand(openCommand);
        staff.addCommand(closeCommand);

        staff.executeCommand();
    }
}
