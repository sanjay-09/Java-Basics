package Complex;

public class NotificationClient {
    static void main() {
        EmailNotifcation email=new EmailNotifcation("sanjay.s01558@gmail.com");
        email.sendNotifications("new show");
        System.out.println(email.email);
    }
}
