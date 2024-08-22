class A{
    public A(){
        System.out.println("IN A");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("IN B");
    }
}

public class ThisAndSuper{
    public static void main(String args[]){
        B obj = new B();
    }
}