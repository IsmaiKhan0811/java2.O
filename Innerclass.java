class A{ // Inner class have member,static and Anonymous
    void show(){
        System.out.println("In show");
    }
    class B{
        void display(){
            System.out.println("In display ");
        }
    }
}
public class Innerclass {
    public static void main(String[] args){
        A obj = new A();
        A.B obj1 = obj.new B();
        obj.show();
        obj1.display();


    }
    
}
