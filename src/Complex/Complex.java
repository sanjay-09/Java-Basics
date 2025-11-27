package Complex;

public class Complex {

    int a;
    int b;
    Complex(int a,int b){
        this.a=a;
        this.b=b;

        add(this);


    }
    void add(Complex obj){
        obj.a+=3;
        obj.b+=3;
    }

}
