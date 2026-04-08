public class ImutableString { //Two ways to initialize
    public static void main(String[] args){
        String s1 = new String("Laptop"); // out of S.C.P Duplicate Allow
        String s2 = new String("Laptop");
        System.out.println(s1==s2);
        String s3 = "Mouse"; // With S.C.P Duplicate don't allow hence point same string s3 and s4
        String s4 = "Mouse";
        System.out.println(s3==s4);
    }
    
}
