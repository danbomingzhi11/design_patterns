package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseListImpl extends CourseList{
    private static List courseList = new ArrayList<>();

    @Override
    public void push(Course course) {
        courseList.add(course);
    }

    @Override
    public void del(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getIterator() {
        CourseIterator courseIterator = new CourseIteratorImpl(courseList);
        return courseIterator;
    }
}
