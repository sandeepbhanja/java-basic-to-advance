class Student{
    String name;
    int rollNumber;
    Student(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
}

public class objectArray{
    public static void main(String args[]){
        Student studentArray[] = new Student[3];
        Student s1 = new Student("Harsh", 0);
        Student s2 = new Student("Bharat", 1);
        Student s3 = new Student("Lala", 2);
        studentArray[0] = s1;
        studentArray[1] = s2;
        studentArray[2] = s3;
        for(Student i:studentArray){
            System.out.println(i.name + " : " +i.rollNumber);
        }
    }
}