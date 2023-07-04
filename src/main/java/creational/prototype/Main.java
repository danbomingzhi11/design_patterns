package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Email mail = new Email();
        mail.setContent("初始模版");
        for (int i = 0; i < 10; i++) {
            Email temMail = null;
            try {
                temMail = (Email) mail.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            temMail.setName("名字" + i);
            temMail.setEmailAddress("地址" + i);
            temMail.setContent("第" + i + "次传输");
            EmailUtils.sendEmail(temMail);
        }
        EmailUtils.savaOriginMailRecord(mail);
    }
}
