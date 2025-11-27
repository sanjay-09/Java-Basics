package Client;


import Complex.EmailNotifcation;

public class mainClient {
    public static void main(String[] args){
        EmailNotifcation email=new EmailNotifcation("sanjay.s01558@gmail.com");
        System.out.println(email.email);

    }
}
