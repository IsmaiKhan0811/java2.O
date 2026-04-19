import java.util.*;

abstract class Aeroplane {
    abstract void takeoff();
    abstract void fly();

    public void landing() {
        System.out.println("Aeroplane landing successfully ");
    }
}

class Cargoplane extends Aeroplane {
    void takeoff() {
        System.out.println("Cargoplane requires longer runway");
    }

    void fly() {
        System.out.println("Cargoplane flies at small height");
    }
}

class Passengerplane extends Aeroplane {
    void takeoff() {
        System.out.println("Passengerplane requires medium runway");
    }

    void fly() {
        System.out.println("Passengerplane flies at medium height");
    }

    public void alert() {
        System.out.println("Gives alert if overloaded");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        Aeroplane ref1 = new Cargoplane();
        ref1.takeoff();
        ref1.fly();
        ref1.landing();

        Aeroplane ref2 = new Passengerplane();
        ref2.takeoff();
        ref2.fly();
        ref2.landing();

        // Downcasting to call child-specific method
        ((Passengerplane) ref2).alert();
    }
}