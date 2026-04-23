class Demo{
    void a() throws Exception {
        System.out.println("This is method a : ");
        b();
        
    }
    void b()throws Exception{
        int a =8;
        int b=0;
        int result =0;
        
        System.out.println(a/b);
        
        
            System.out.println(result);
        
    }
}

public class Exception4 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        try{
        obj.a();
        }catch(Exception e){
            System.out.println("Handled in main: " + e);
        }
        
    }
    
}
