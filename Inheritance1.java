class Human{
    int age;
    private String name;
    void sleep(){
        age=19;
        System.out.println("Human Can Sleep ");
        System.out.println("Age is : " + age);
    }
    Human(){
        System.out.println("This is Constructor ");
    }
    
}
class Student extends Human{
    // Student(){
       // Default Constructor having Super() Method in first line so call parent class constructor which is Human()
    // }
    void disp(){
        System.out.println("Age is : "+ age);
       //  System.out.println("Name is : "+ name); Gives Error because Name is private member in Human class Private member not inherited in child class
    }

}
public class Inheritance1 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.disp();
        s1.sleep();
        

    }
    
}
