package OOPS2;

public abstract class Product {

    protected String name;
    protected double price;

    Product(String name,double price){
        this.name=name;
        this.price=price;
    }

    abstract double calculateTaxes();
    abstract double calculateShippingCharges();

}
