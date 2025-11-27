package OOPS;

public class AdminUser extends User{

    public AdminUser(String name,String email){
        super(name,email);
    }
    public void manageProducts(){
        System.out.println("Admin is manaing products");

    }

//     @Override
//    public void dashBoard(){
//        System.out.println("admin user dasboard");
//    }

    public static void main(String[] args){
        AdminUser admin=new AdminUser("sanjay","sanjay.s01558@gmail.com");
        admin.login();
        admin.dashBoard();
    }
}

