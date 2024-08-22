
class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return Math.abs(n1-n2);
    }
}

public class Inheritance{
    public static void main(String args[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(1, 2);
        int r2 = obj.sub(7, 9);
        System.out.println(r1 + " " + r2);
        AdvCal obj2 = new AdvCal();
        int r3 = obj2.add(9, 1);
        int r4 = obj2.sub(9, 1);
        int r5 = obj2.mul(9, 2);
        int r6 = obj2.modulo(25, 6);
        System.out.println(r3 + " " + r4 +" " + r5 + " " +r6);
    }
}