public class Arr {
    public static void main(String[] args ){
        int arr[] = new int[4]; // if we want to declare arr by ourself
        arr[0]=5; // arr always stored in heap memory
        arr[1]=4;
        arr[2]=3;
        arr[3]=7;
        for(int i=0; i<=3; i++){
            System.out.println(arr[i]);
        }
    }
    
}
