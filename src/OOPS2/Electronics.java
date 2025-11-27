package OOPS2;

public class Electronics extends Product{

    public Electronics(String name,int age){
        super(name,age);
    }

    public double calculateTaxes(){
        return this.price*0.10;
    }
    public double calculateShippingCharges(){
        return this.price*0.20;
    }
}
