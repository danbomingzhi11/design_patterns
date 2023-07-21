package structural.templatementhod;

public abstract class Course {

    protected void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (writeArticle()) {
            this.makeArticle();
        }
    }

    private final void makePPT() {
        System.out.println("制作PPT");
    }

    private final void makeVideo() {
        System.out.println("制作视频");
    }

    private final void makeArticle() {
        System.out.println("制作手记");
    }

    protected boolean writeArticle() {
        return false;
    }

    abstract void packageCourse();
}
