interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Computer implements Printable,Showable{
    public void print(){
        System.out.println("Printing...");
    }
    public void show(){
        System.out.println("Show...");
    }
}
    public class MIUI {
    public static void main(String[] args){
        Computer c = new Computer();
        c.print();
        c.show();

    }
    
}
