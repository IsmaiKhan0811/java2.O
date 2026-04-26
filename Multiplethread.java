class Banktransaction extends Thread{ // Example of creating Multiple Threads
    private String TransactionName;
    public Banktransaction(String name) {
        this.TransactionName=name;

    }
    public void run(){
        System.out.println(TransactionName + " Started");
        try {
            Thread.sleep(2000);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(TransactionName + " completed");
    }
    
}
public class Multiplethread { // There are mainly three threads are present in this code
    public static void main(String[] args){ // Thread 1 call by main Method
        Banktransaction t1 = new Banktransaction("Deposit");// Thread t2 deposit 
        Banktransaction t2 = new Banktransaction("Withdrawl");// Thread t3 // withdrawal
        t1.start();
        t2.start();

    }
    
}
