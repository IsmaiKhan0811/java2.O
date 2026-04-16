class Student {
    private int age;
    private String name;

    public Student(){
        //Super() call the constructor of parent class
        //this() call the constructor of same class
        this("Rohan", 18);
        System.out.println("Default constructor");
    }

    public Student(String name){
        this(name, 19);
    }

    public Student(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void disp(){
        System.out.println(age);
        System.out.println(name);
    }

}
public class Constructor3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.disp();
        Student s2 = new Student("Rahul");
        s2.disp();

        
    }
    
}
