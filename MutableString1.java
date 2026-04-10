public class MutableString1 {
    public static void main(String[] args ){
    final StringBuilder str = new StringBuilder("Virat");
        str.append("Kohli");
        System.out.println(str);
       // str = new StringBuilder("Sachin"); [Gives Eroooooooor]
        //System.out.println(str);
// Final means you can't change the obj reference to point another Refernce or object But you can still Mutable its state
    }
    
}
