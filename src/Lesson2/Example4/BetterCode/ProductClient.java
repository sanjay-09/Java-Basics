package Lesson2.Example4.BetterCode;

public class ProductClient {
    static void main() {
        Product p=new Electronics(10000);
        System.out.println(p.calculateDiscount());
        System.out.println(p.price);
        System.out.println(p.type);
        p=new Clothing(2000);
        System.out.println(p.calculateDiscount());
        System.out.println(p.price);
        System.out.println(p.type);
    }
}
