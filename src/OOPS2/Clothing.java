package OOPS2;

public class Clothing extends Product{

    public Clothing(String name,int age){
        super(name,age);
    }
    public double calculateTaxes(){
        return this.price*0.1;
    }
    public double calculateShippingCharges(){
        return this.price*0.2;
    }
}
