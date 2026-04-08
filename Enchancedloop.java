public class Enchancedloop {
    public static void main(String[] args ){
        int arr[][] = {
            {5,2,3},
            {1,6},
            {9,8,7}
        };
        for(int a[] : arr){
            for( int b : a){
                System.out.println(b);
            }
            System.err.println("");
        }
    }
    
}
