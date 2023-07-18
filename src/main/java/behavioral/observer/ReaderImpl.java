package behavioral.observer;

public class ReaderImpl extends Reader {
    public ReaderImpl(String name, String sex, String bodyCart) {
        this.name = name;
        this.sex = sex;
        this.bodyCart = bodyCart;
    }

    @Override
    public void update(Observable observable, Object arg) {
        Author author = (Author) observable;
        Article article = (Article) arg;

        System.out.println(String.format("异步接受----" +
                "%s 最新章节:" +
                "%s", author.userName, article.title));
    }
}
