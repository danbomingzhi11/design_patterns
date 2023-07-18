package behavioral.iterator;

public interface CourseList  {
    abstract void push(Course course);

    abstract void del(Course course);

    CourseIterator getIterator();
}
