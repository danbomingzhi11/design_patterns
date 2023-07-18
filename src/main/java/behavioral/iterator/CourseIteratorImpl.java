package behavioral.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {
    private List courseList;
    private Integer positon;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    @Override
    public Course nextCourse() {
        return (Course) courseList.get(positon++);
    }

    @Override
    public Boolean isLast() {
        if (positon < courseList.size()) {
            return false;
        }
        return true;
    }
}
