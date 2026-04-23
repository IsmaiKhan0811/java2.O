import java.util.*;
public class Exception3 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value of n: ");
            num=sc.nextInt();
        
            
        } catch (InputMismatchException e) {
            System.out.println("Enter valid no : ");
        }
        finally{
            sc.close();
        }
        System.out.println(num);
        
    }
    
}
