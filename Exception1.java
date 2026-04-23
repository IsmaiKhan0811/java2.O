public class Exception1 {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        int result = 0;

        try {
            result = a / b;
            System.out.print("In try block");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }

        System.out.println("Result is: " + result);
        System.out.println("Bye");
    }
}