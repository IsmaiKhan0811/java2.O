public class calc { // Method Overloading 
    public int add(int n1, int n2){ // Same method name but different parameters
         int result = n1+n2;
         return result;
    }
     public int add(int n1, int n2, int n3){
         int result = n1+n2+n3;
         return result;
    }
     public double add(double n1, double n2){
         double result = n1+n2;
         return result;
    }
    public static void main(String[] args){
        calc obj = new calc();
        int res1 = obj.add(4,5);
        System.out.println(res1);
        int res2 = obj.add(4,5,6);
        System.out.println(res2);
        double res3 = obj.add(4.7,5.8);
        System.out.println(res3);
    }
    
}
