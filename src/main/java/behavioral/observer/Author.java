package behavioral.observer;

public abstract class Author extends Observable {
    public String userName;
    public String id;


    abstract void push();
}
