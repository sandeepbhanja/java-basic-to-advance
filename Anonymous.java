class A{
    public A(){
        System.out.println("A Constructor");
    }
    public void show(){
        System.out.println("Inside show of A");
    }
}

public class Anonymous{
    public static void main(String args[]){
        new A().show();
    }

}