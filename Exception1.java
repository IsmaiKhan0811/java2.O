import java.util.*; // This code is correcct gives error due to the editor
public class Exception1 {
    public static void main(String[] args){
        int a = 8;
        int b = 0;
        int result =0;
        try {
            result = a/b;
            System.out.print("In try bllock");
        } 
        catch (Exception e) { 
            System.out.println("Something went wrong : " + e);
        }
        System.out.println("Result is : "+result);
        System.out.println("Byee");
    }
    
}
