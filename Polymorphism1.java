
class Aeroplane {
    void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    void fly(){
        System.out.println("Aeroplane is flying");
    }
    
}
class Cargoplane extends Aeroplane{
    void takeoff(){
        System.out.println("cargoplane requires longer runway");
    }
    void fly(){
        System.out.println("Cargoplane flies at lower height");
    }
}
class Passengerplane extends Aeroplane{
    void takeoff(){
        System.out.println("Passengerplane requires medium size runway");
    }
    void fly(){
        System.out.println("Passengerplane flies at medium height");
    }
}
class Fighterplane extends Aeroplane{
    void takeoff(){
        System.out.println("Fighterplane requires small runway ");
    }
    void fly(){
        System.out.println("Fighterplane fliea at high height");
    }
}
class Airport{
    public void poly(Aeroplane ref){
    ref.takeoff();
    ref.fly();
    System.out.println("-----------------");
    }
}
public class Polymorphism1 {
    public static void main(String[] args){
        Cargoplane cp = new Cargoplane();
        Passengerplane pp = new Passengerplane();
        Fighterplane fp = new Fighterplane(); 
        Airport a = new Airport();
        a.poly(fp);
        a.poly(pp);
        a.poly(cp);

    }
    
}
