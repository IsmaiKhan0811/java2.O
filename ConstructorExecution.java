class Demo{
    int a,b;
   public Demo(){
    
     System.out.print("Parent class Constructor : ");
   }
   public Demo(int x, int y){
    System.out.println("Parameterized constructor");
    a=x;
    b=y;
   }
}
class Demo2 extends Demo{
    int m,n;
    public Demo2(){
        System.out.println("Default constructor");
    }
    public Demo2(int o,int p){
        super(o, p);
        System.out.println("Paramaterized Constructor");
        m=o;
        n=p;
    }
}
public class ConstructorExecution {
    public static void main(String[] args){
        Demo2 d2 = new Demo2(5,4);
       

    }
    
}
