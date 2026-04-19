@FunctionalInterface // Lambda Function is only used in Functional Interface
interface car{
    // 1 void drive();
    // 2 void drive(int avg);
    void drive(int avg, int ts); // Basically shorten the code 
}
public class Lambda {
    public static void main(String[] args){
        // 1 car obj = () -> System.out.println("Driving...");
        // 2 car obj = avg -> System.out.println("Driving...17");
        car obj = (avg, ts) -> System.out.println("Avg is " + avg + " Top speed is : " + ts);
        obj.drive(17,200);

    }
    
}
