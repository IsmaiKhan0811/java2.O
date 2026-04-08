public class JaggedArr { // No of rows are fixed but no of columns are different
    public static void main(String[] args ){
        int arr[][] = {
            {1,2,3},
            {4,5},
            {6,7,8}
        };
        for(int i =0; i<3; i++){
            for(int j=0;j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
    
}
