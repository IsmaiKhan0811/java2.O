public class Palindromeoptimal {
    public static char [] checkpalindrome(char arr[]){
        int left = 0;
        int right=arr.length-1;
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
        

    }
    public static void main(String[] args){
        String str = "121";
        char arr[] = str.toCharArray();
        Palindromeoptimal obj = new Palindromeoptimal();
        char[] res = obj.checkpalindrome(arr);
        System.out.println(res);
    }
    
}
