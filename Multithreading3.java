import java.util.*;
class Customthread1 extends Thread{
    public void run(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Thread one working ");
    System.out.println("Enter the value of num 1 : ");
    int num1 = sc.nextInt();
     System.out.println("Enter the value of num 2 : ");
    int num2 = sc.nextInt();
    int result = num1+num2;
    System.out.println("result is : "+result);
    System.out.println("Task ended");
    }
}
class Customthread2 extends Thread{
    public void run(){
        System.out.println("Thread two working ");
        try{
        for(int i=0; i<5; i++){
            System.out.print("*");
            Thread.sleep(2000);
        }  
        }
        catch(Exception e){
            System.out.println("Some problem");
        }
        System.out.println("Task ended");
    }
}
class Multithreading3 {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Customthread1 c1 = new Customthread1();
        Customthread2 c2 = new Customthread2();
        c1.start();
        c2.start();
       
    }
}