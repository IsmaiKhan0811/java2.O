public class Instancev {
    int a=0; // Instance variable initialize within class but out of the method
    String name="Navin";// Instance variable can hold null value;

    public static void main(String[] args) {
        int num =0; // Primitive variable // Local Variable will not contain null value
        Instancev obj1 = new Instancev();
        Instancev obj2 = new Instancev();
        obj1.name="Rahul"; // Change in one instance will not affect other instance
        System.out.println(obj1.a);
        System.out.println(obj1.name);
        System.out.println(obj2.a);
        System.out.println(obj2.name);
        
    }}
    
