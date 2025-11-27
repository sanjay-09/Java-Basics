package Complex;

public class EmailNotifcation implements Notification{

    public String email;

    public EmailNotifcation(String email){
        this.email=email;
    }

    @Override
    public void sendNotifications(String message){
        System.out.println("email has sent with"+message+"to"+this.email);
    }
    @Override
    public void subscribeToTopic(String topic){
        System.out.println(topic+"is attached to the email"+this.email);

    }
}
