class Student{
    private int age;
    private String name;
    public void setdata(int age){
        this.age=age; //Shadowing problem will be solved by this keyword
    }
    public void setdata1(String name){
        this.name=name; //  This keyword assign this object (Present)
    }
    public void show(){
        System.out.println(age + " " + name);
    }
}
public class Encapsulation2 {
    public static void main(String[] args){
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setdata(19);
        obj.setdata1("Rahul");
        obj1.setdata(21);
        obj1.setdata1("Navin");
        obj.show();
        obj1.show();

    }
    
}
