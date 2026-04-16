class Student{
    private int age; 
    private String name;
    public Student(int age, String name){
        this.age=age;
        this.name=name;

    }
    public void show(){
        System.out.println(age + " "+ name);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student obj = new Student(19,"Ankit");
        obj.show();
        
    }}
    

