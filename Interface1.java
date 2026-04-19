import java.util.*;
interface computer{
    abstract void compilecode();

}
class Laptop implements computer{
    public void compilecode(){
    System.out.println("You got 5 errors");
    }

}
class Desktop implements computer{
    public void compilecode(){
    System.out.println("You got 5 errors fasterr");
    }

}
class Developer {
    public void buildapp(computer obj){
        System.out.println("Building App");
        obj.compilecode();
    }
}
public class Interface1 {
    public static void main(String[] args) {
    computer obj = new Desktop();
    Developer dev = new Developer();
    dev.buildapp(obj);
    }
}

