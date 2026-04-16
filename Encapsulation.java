class Student{
    private int age;
    private String name;
    public void show(){
        System.out.println(age + " " + name);
    }
    public void setdata(){
        age=19;
        name="Ankit";

    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student obj = new Student();
        obj.setdata();
        obj.show();
        

        
        
    }
    
}
