package OOPS;

public class RegularUser extends  User {

    public RegularUser(String name,String email){
        super(name,email);
    }

    public void browseProducts(){
        System.out.println("I am shopping");
    }



    @Override
    public void dashBoard(){
        System.out.println("Regular user dashboard");
    }





}
