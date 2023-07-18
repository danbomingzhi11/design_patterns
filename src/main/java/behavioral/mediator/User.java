package behavioral.mediator;

public class User {
    private static SendEmail sendEmail = new SendEmail();
    private String name;
    private String address;

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void sendEmail(String message) {
        sendEmail.messageMediator(this, message);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
