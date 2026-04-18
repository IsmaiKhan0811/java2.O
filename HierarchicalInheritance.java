class Animal{ // In this one Parent class have two or more child class
    void eat(){
        System.out.println("Animal can eat "); // Method of Parent class 
    }
}
class Dog extends Animal{

}
class Cat extends Animal{

}
class Deer extends Animal{

}
public class HierarchicalInheritance {
    public static void main(String[] args){
        Deer d1 = new Deer(); //call from child class object
        d1.eat();

    }    
}
