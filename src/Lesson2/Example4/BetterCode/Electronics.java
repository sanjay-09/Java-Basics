package Lesson2.Example4.BetterCode;

public class Electronics extends Product{
    Electronics(double price){
        super(ProductType.ELECTRONICS,price);
    }
    @Override
    public double calculateDiscount(){
        return this.price*0.10;
    }
}
