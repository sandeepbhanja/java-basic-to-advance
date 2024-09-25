class A{
    int age;

    public void show(){
        System.out.println("show");
    }

    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

public class innerClass{
    public static void main(String args[]){
        A obj = new A();
        
        A.B obj1 = obj.new B();

        obj1.config();
    }
}