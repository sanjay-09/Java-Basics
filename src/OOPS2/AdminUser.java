package OOPS2;

public class AdminUser extends User {

    public AdminUser(String name,int age){
        super(name,age);
    }

    public void userAdd(){
        System.out.println("user added");
    }

    @Override
    public void dashboard(){
        System.out.println("admin user dashboard");
    }
}
