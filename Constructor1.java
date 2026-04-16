class Student{
    private int a;
    private int b; 
    public Student(){ //Default Constructor (We have to initialize default constructor by ourself if we used any paramaterized constructor in our program)
        System.out.println("For Default Constructor");// Cause compilers knows we have knowledge of constructor so they not create by default 
    }
    public Student(int a, int b){ // Paramaterized Constructor
        this.a=a;
        this.b=b;
    }
    public void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Constructor1 {
    public static void main(String[] args ){
        Student obj = new Student();
        obj.disp();
        Student obj1 = new Student(2, 3);
        obj1.disp();

    }
    
}
