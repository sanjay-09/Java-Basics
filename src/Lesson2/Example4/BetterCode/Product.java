package Lesson2.Example4.BetterCode;


enum ProductType{
    ELECTRONICS,
    CLOTHING
}
public abstract class Product {

    ProductType type;
    double price;

    Product(ProductType type,double price){
        this.type=type;
        this.price=price;
    }

    abstract double calculateDiscount();



}
