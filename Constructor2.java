class Student{ 
    private int age; 
    private String name;
    public Student(){
        System.out.println("Default Constructor");
        name="Rohan";
        age=18;
    } 
    Student(String name){
        this.age=0;
        this.name=name;
    }

    public Student(int age, String name) {
        this.age = age; 
        this.name = name;
    }
    
    public void disp(){
        System.out.println(age);
        System.out.println(name);
    }
}
public class Constructor2 {
    public static void main(String[] args){
        Student s = new Student();
        s.disp();
        Student s1 = new Student("Aryan");
        s1.disp();
        Student s2 = new Student(19,"Ankit");
        s2.disp();

    }
    
}
