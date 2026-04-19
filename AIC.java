interface Car{// Anonymous class
    void drive();
}
public class AIC {
    public static void main(String[] args){
        Car obj = new Car() // ** This is not the object of interface **
        {
            public void drive() // This is used only one time that's why name is Anonymous class
            {
                System.out.println("Driving.......");
            }
        };
        
        obj.drive();
        

    }
    
}
