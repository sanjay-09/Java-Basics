package OOPS;

public class OnlineStore {
    public static void main() {
        Product electronics=new Electronics("iphone",10090);
        Product clothing=new Clothing("jeans",1500);

        System.out.println(electronics.price);
        System.out.println(electronics.name);
        System.out.println(electronics.calculateTaxes());
        System.out.println(electronics.calculateShippingCost());

        System.out.println(clothing.price);
        System.out.println(clothing.name);

        System.out.println(clothing.calculateTaxes());
        System.out.println(clothing.calculateShippingCost());


    }
}
