interface A{ // Java 8 we write method body in interface
    void show();
    default void config(){ // Intoduce in java 8 feature
        System.out.println("In Config");
    }
    static void abc(){// Intoduce in java 8 feature
        System.out.println("In abc");
    }
}
class B implements A{ // we have to declare the method show() with the help of class
    public void show(){
        System.out.println("In show");
    }
}
public class java8fe {
    public static void main(String[] args ){
        A.abc(); // Non static method can call directly
        B obj = new B();
        obj.show();
        obj.config();

    }
    
}
