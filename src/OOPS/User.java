package OOPS;

public class User {
    private String name;
    private String email;

    public User(String name,String email){
        this.name=name;
        this.email=email;
    }

    public void login(){
        System.out.println("name:"+this.name+"email"+this.email);
    }

    public void dashBoard(){
        System.out.println("Dashoard for the user");
    }
}
