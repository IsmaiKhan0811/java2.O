class MyTask implements Runnable{
    public void run(){
    String Name = Thread.currentThread().getName();
    if(Name.equals("Deposit")){
        System.out.println("Performing Deposit");

    }
    else if(Name.equals("Withdrawl")){
        System.out.println("Performing Withdrawl");
    }
    else{
        System.out.println("Other Task ");
    }
    }

}

public class Multithreading4 {
    public static void main(String[] args){
    MyTask Task = new MyTask();
    Thread t1 = new Thread(Task,"Deposit");
    Thread t2 = new Thread(Task,"Withdrawl");

    t1.start();
    t2.start();
    
}
}