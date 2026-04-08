public class String1 {
    public static void main(String[] args ){
        String brand = "Java"; // Immutable string
        System.out.println(brand);
        brand.concat("code"); // Immutable method
        System.out.println(brand);// ( No strind will added in output)
        StringBuilder brand1 = new StringBuilder("DSA"); // Mutable string
        System.out.println(brand1);
        brand1.append("code"); // Mutable method
        System.out.println(brand1);// (String will be added in output)
    }
    
}
