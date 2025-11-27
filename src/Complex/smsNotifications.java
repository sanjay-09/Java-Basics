package Complex;

public class smsNotifications implements Notification{

    int phoneNumber;

    public smsNotifications(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void sendNotifications(String message){
        System.out.println(message+"has been sent to"+this.phoneNumber);
    }
    @Override
    public void subscribeToTopic(String topic){
        System.out.println(this.phoneNumber+"is attached with"+topic);

    }
}
