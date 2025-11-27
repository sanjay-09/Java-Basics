package Lesson2.Example4.ProblematicCode;

 enum ProductType{
     ELECTRONICS,
     CLOTHING

}

class Product {
     ProductType type;
     double price;


     Product(ProductType type,double price){
         this.type=type;
         this.price=price;
     }
     double getPrice(){
         return this.price;
     }
     ProductType getType(){
         return  this.type;
     }
}


public class DiscountCalculator{
     public double Calculator(Product product){
         if(product.getType().equals(ProductType.ELECTRONICS)){
             return product.getPrice()*0.10;

         }
         else if(product.getType().equals(ProductType.CLOTHING)){
             return product.getPrice()*0.20;

         }
         else{
             return 0;
         }
     }
}