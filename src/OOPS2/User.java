package OOPS2;

public class User {

    String name;
    int age;

    public User(String name,int age){
        this.name=name;
        this.age=age;

    }

    public void login(){
        System.out.println("login done");
    }

    public void dashboard(){
        System.out.println("user dashboard");
    }
}
