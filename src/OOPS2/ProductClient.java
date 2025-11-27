package OOPS2;

public class ProductClient {

    public static void main(String[] args){

        Product electronics=new Electronics("iphone",20000);
        Product clothing=new Electronics("jeans",1500);

        System.out.println(electronics.name);
        System.out.println(electronics.price);
    }
}
