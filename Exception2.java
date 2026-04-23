public class Exception2 {
    public static void main(String[] args) {
        int a=8;
        int b=3;
        int result=0;
        int arr[] ={6,2,7,9,3};
        String s =null;
        try {
            result=a/s.length();
            System.out.println(arr[6]);
            
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(arr.length-1);
            System.out.println("Stay in your Limit");
        }
        catch(NullPointerException e){
            System.out.println("String can't be null");
        }
        catch(Exception e){
            System.out.println("Something went wrong"+ e);
    
        }
        System.out.println(result);
        System.out.println("bye");

        
    }}
    

