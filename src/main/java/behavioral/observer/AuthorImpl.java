package behavioral.observer;

public class AuthorImpl extends Author {
    public AuthorImpl(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getId() {
        return id;
    }

    public void push() {
        ArticleImpl article = new ArticleImpl();
        article.setTitle("洪武大帝");
        change();
        notifyObservers(article);
    }
}
