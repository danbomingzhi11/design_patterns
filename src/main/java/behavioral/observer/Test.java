package behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Author author = new AuthorImpl("当年明月");

        Reader reader = new ReaderImpl("薯条",
                "男", "24646164646446");
        author.addBean(reader);

        author.push();
    }
}
