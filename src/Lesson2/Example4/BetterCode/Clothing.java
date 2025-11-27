package Lesson2.Example4.BetterCode;

public class Clothing extends  Product{

    Clothing(double price){
        super(ProductType.CLOTHING,price);
    }

    public double calculateDiscount(){
        return  this.price*0.2;
    }
}
