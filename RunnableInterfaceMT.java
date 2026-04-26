class deposit implements Runnable{ // creating Multiple threads using Runnable interface
    public void run(){
    System.out.println("Cash deposit");
    }
}
class withdrawl implements Runnable{
    public void run(){
    System.out.println("Cash Withdrawl");
    }
}
public class RunnableInterfaceMT {
    public static void main(String[] args) {
        deposit d = new deposit();
        withdrawl w = new withdrawl();
        Thread t1 = new Thread(d);// create thread and pass the reference of class obj 
        Thread t2 = new Thread(w);// create thread and pass the reference of class obj 
        t1.start();
        t2.start();
        
    }}
    

