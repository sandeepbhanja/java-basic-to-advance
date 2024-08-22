
class A{
    public void show(){
        System.out.println("Inside A show");
    }
    public void config(){
        System.out.println("Inside config");
    }
}

class B extends A{
    public void show(){
        System.out.println("Inside B show");
        super.show();
    }
}


public class MethodOverding{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
        obj.config();
        
    }
}