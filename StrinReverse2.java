public class StrinReverse2 {
    public static void main(String[] args) {
        String str1 = " Pw Java Skill";
        String str2 = " ";
        String sarr[] = str1.split(" ");
        for(int i =sarr.length-1; i>=0; i--){
            str2 = str2 + sarr[i] + " ";
        }
        System.out.println("Before reverse : " + str1);
        System.out.println("After reverse: " + str2);
        
    }
    
}
