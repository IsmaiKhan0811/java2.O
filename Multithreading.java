import java.util.Scanner;

public class Multithreading {
    public static void main(String[] args){
        System.out.println("First task start here");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter num2 : ");
        int num2=sc.nextInt();
        int result=num1+num2;
        System.out.println("Result is : " + result);
        System.out.println("First task ends here "); // Task 2 an Task3 wait for Task 1 completed cause line of execution stop here where we have to write a input for num1 and num2
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("Second task start here ");
        for(int i=0; i<5;i++){
            System.out.print("*");
        }
        System.out.println("Second task end here ");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        System.out.println("Third task is start here");
        for(int i=0; i<10;i++){
            System.out.print("#########################");
        }
        System.out.println("Third task2 eend here");
    }
    
}
