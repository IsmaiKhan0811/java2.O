class Aeroplane{
    void takeoff(){
        System.out.println("Aeroplane is taking off ");
    }
    void fly(){
        System.out.println("Aeroplane is Flying ");
    }
}
class Cargoplane extends Aeroplane{
    void takeoff(){
        System.out.println("Cargoplane required long size runway ");
    }
    void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
}
class Passengerplane extends Aeroplane{
    void takeoff(){
        System.out.println("Passengerplane required medium size runway ");
    }
    void fly(){
        System.out.println("Passengerplane flies at higher height ");
    }

}
public class Polymorphism {
    public static void main(String[] args){
        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        Aeroplane ref;
        ref=cp; // We can pass the child class ref into parent class ref
        ref.takeoff();
        ref.fly();
        System.out.println("---------------------------------");
        ref=pp; // Child class ref assign to parent class ref
        pp.takeoff();
        pp.fly();

    }
    
}
