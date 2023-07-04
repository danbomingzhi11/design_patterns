package creational.prototype;

import java.text.MessageFormat;

public class EmailUtils {
    public static void sendEmail(Email mail) {
        String outPutContent = "向{0}同学发送邮件，邮件地址为{1}，邮件内容{2}";
        System.out.println(MessageFormat.format(outPutContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void savaOriginMailRecord(Email mail) {
        System.out.println("保存邮件内容" + mail.getContent());
    }
}
