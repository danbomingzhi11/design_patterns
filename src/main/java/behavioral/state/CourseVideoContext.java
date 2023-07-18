package behavioral.state;

public class CourseVideoContext {
    private CourseVideoState courseVideoStatus;

    public CourseVideoState getCourseVideoState() {
        return courseVideoStatus;
    }

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        courseVideoState.setCourseVideoContext(this);
        this.courseVideoStatus = courseVideoState;
    }

    public void play() {
        this.courseVideoStatus.play();
    }

    public void speed() {
        this.courseVideoStatus.speed();
    }

    public void stop() {
        this.courseVideoStatus.stop();
    }

    public void pause() {
        this.courseVideoStatus.pause();
    }

}
