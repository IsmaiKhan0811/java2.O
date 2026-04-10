public class MutableString2 { // Sme Methods
    public static void main(String[] args){
        StringBuilder str1 = new StringBuilder();
        System.out.println(str1.capacity()); // Default Capacity is 16
        str1.append("abcdefghijklmnop");
        System.out.println(str1.capacity());
        str1.append("q"); // if add +1 above 16 then size increase in this form (oldcapacity+1)*2
        System.out.println(str1.capacity()); //Give 34
        System.out.println(str1.length());

        StringBuilder  str2 = new StringBuilder("Sachin");
        System.out.println(str2); 
        System.out.println(str2.capacity()); // 16 + 5 == 22 size
        System.out.println(str2.charAt(1));
        str2.setCharAt(1, 'A');
        System.out.println(str2);

        StringBuilder a = new StringBuilder(150);// fixed Size
        System.out.println(a.capacity());
        a.append("Java");
        System.out.println(a);
        a.trimToSize(); // Trim all the vacant part of String only hold 4 size of String a ="java" 
        System.out.println(a.capacity());
    }
    
}
