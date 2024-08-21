class Mobile{
    String name;
    String brand;
    int price;
    static String type;

    static{
        type = "Smartphone";
        System.out.println("inside static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        name = "";
        System.out.println("inside constructor block");
    }

    public void show(){
        System.out.println(this.name+" "+this.brand+" "+this.price+" "+type);
    }

    public static void show1(Mobile obj){
        System.out.println("This is static method " + obj.name+" "+obj.brand+" "+obj.price+" "+type);
    }
}

public class staticDemo{
    public static void main(String args[]){

        try{
            
        Class.forName("Mobile");
        // Mobile m1 = new Mobile();
        // m1.name = "15";
        // m1.brand = "Apple";
        // m1.price = 70000;

        // Mobile m2 = new Mobile();
        // m2.name = "S24";
        // m2.brand = "Samsung";
        // m2.price = 69000;

        // m1.show();
        // m2.show();

        // Mobile.type = "NextX Smartphone";

        // m1.show();
        // m2.show();

        // Mobile.show1(m1);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}