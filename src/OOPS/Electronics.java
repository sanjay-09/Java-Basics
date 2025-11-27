package OOPS;

public class Electronics extends  Product{
    public Electronics(String name,double price){
        super(name,price);
    }



    @Override
    public double calculateTaxes(){
        return this.price*0.10;

    }
    @Override
    public double calculateShippingCost(){
        return this.price*0.2;

    }
}
