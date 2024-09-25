public class wrapper{
    public static void main(String[] args){
        int num = 7;
        Integer num1 = num; //autoboxing-converting primitive types to integer object
        int num2 = num1.intValue();
        System.out.println(num2); //unboxing-converting integer objects to primitive type
    }
}