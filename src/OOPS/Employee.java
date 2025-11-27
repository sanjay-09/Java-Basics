package OOPS;

public class Employee{


    String name;
    int age;
    private int salary;

    Employee(){
        System.out.println("this is a default constructor");
        System.out.println(this);
    }
    Employee(String name,int age){
        this.name=name;
        this.age=age;
    }


}
