
class Calculator{
    public int add(int a, int b){
        System.out.println("Inside Add");
        return a+b;
    }

    public float add(float a , float b){
        System.out.println("Inside overloaded add");
        return a+b;
    }
}

public class demo{
    public static void main(String args[]){
        int n1 = 3;
        int n2 = 5;
        Calculator cal1 = new Calculator();
        int a = cal1.add(n1,n2);
        float b = cal1.add(10.8f, 11.3f);
        System.out.println(a);
        System.out.println(b);
    }
}