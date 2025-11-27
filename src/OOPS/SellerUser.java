package OOPS;

public class SellerUser extends  User {

    public SellerUser(String username,String email){
        super(username,email);
    }
    public void addProducts(){
        System.out.println("Products is added");
    }
    @Override
    public void dashBoard(){
        System.out.println("Seller User is added");
    }
}
