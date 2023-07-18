package behavioral.mediator;

import java.util.Date;

public class SendEmail {
    public void messageMediator(User user, String message) {
        System.out.println(String.format("send email to %s, " +
                "userName = %s , message = %s", user.getAddress(),
                user.getName(), message));
    }
}
