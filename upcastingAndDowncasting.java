class A{
    public void show1(){
        System.out.println("In Show A");
    }
}

class B extends A{
    public void show2(){
        System.out.println("In Show B");
    }
}

public class upcastingAndDowncasting {
    public static void main(String[] args) {
        A obj = (A)new B();
        obj.show1();
    }
}
