class Demo{ // Parent class // Multi level inheritance
    public void disp(){
        System.out.println("Method present in Demo class");
        
    }
}
class Demo1 extends Demo{ // chil class for Demo class && Parent class for Demo 2 class 
 //  level 1
}
class Demo2 extends Demo1{ // chil class for Demo1 class
// level 2
}
public class MultilevelInheritance {
    public static void main(String[] args){
        Demo d1 = new Demo();
        d1.disp();

    }
    
}
