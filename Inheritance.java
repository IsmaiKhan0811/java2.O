class Human{ // Parent class
    int age; 
    public void sleep(){
        age =18;
        System.out.println("Human Can Sleep ");
        System.out.println(age);
    }
}
class Student extends Human{ // Child class 
                             // entends keyword are used to use or inherit property of parent class
}
public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.sleep();
        
    }
    
}
