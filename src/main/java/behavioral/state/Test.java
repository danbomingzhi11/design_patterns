package behavioral.state;

public class Test {
    public static void main(String[] args) {
        CourseVideoContext courseVideoContext = new CourseVideoContext();
        courseVideoContext.setCourseVideoState(new PauseState());
        courseVideoContext.pause();
    }
}
