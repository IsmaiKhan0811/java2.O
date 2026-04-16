class Student{
    private int age; // Instatnce variable
    private String name;
    public void setdata1(int age){// Local Variable
        age = age;// shadowing problem Give the priority to local variable always

    }
    public void setdata2(){
        name="Rahul";


    }
    public void show(){
        System.out.println(age + " " + name);
    }
}
public class Encapsulation1 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setdata1(20);
        obj1.setdata1(19);
        obj.show();
        obj1.show();



        
    }
    
}
