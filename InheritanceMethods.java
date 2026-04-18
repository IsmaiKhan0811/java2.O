class Aeroplane{ // Types of Methods in Inheritance
    public void takeoff(){
        System.out.println("Aeroplane can takeoff");
    }
    public void fly(){ // override Method
        System.out.println("Aeroplane can fly");
    }

}
class Cargoplane extends Aeroplane{
    public void fly(){ // Overriding add something extra to existing method
        System.out.println("Can fly on lower height");
    }
    public void carrygoods(){ //Specialized Method for Cargoplane class
        System.out.println("Cargoplane carries goods");
    }
}
class Passengerplane extends Aeroplane{
    public void fly(){// Overriding add something extra to existing method
        System.out.println("Can fly on higher height");
    }
    public void carrypassenger(){//Specialized Method for Passengerplane class
        System.out.println("Passengerplane carries passenger");
    }
}
public class InheritanceMethods {
    public static void main(String[] args) {
        Aeroplane ap = new Aeroplane();
        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        ap.takeoff();
        ap.fly();
        cp.fly();
        cp.carrygoods();
        pp.fly();
        pp.carrypassenger();
        
    }}
    
