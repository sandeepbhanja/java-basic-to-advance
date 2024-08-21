
class Human{
    private int age;
    String name;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

public class encapsulation{
    public static void main(String args[]){
        Human obj1 = new Human();
        obj1.setAge(22);
        obj1.name = "Lucifer";

        System.out.println(obj1.name);
        System.out.println(obj1.getAge());
    }
}