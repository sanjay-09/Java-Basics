package OOPS2;

public class UserClient {
    public static void main(String[] args){
        AdminUser admin=new AdminUser("sanjay",19);
        admin.login();
        admin.userAdd();
        admin.dashboard();
    }
}
