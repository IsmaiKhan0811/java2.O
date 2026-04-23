public class Multithreading1 {
    public static void main(String[] args){
        System.out.println("Before changing ");
        String name = Thread.currentThread().getName();
        System.out.println("Before changing the name of thread is : " + name);
        int n = Thread.currentThread().getPriority();
        System.out.println("Before changing the priority of thread  is : "+n);

        System.out.println("After changing");
        
         Thread.currentThread().setName("Pw ");// We can change the name of main thread
         String name1=Thread.currentThread().getName();
         System.out.println("After changing the name of thread is :  "+name1);
        Thread.currentThread().setPriority(8);// We can set the priority of main thread
        int n1= Thread.currentThread().getPriority();
        System.out.println("After changing the priority of thread is : "+n1);
        Thread.currentThread().setPriority(5);
        
    }
    
}
