public class String3 { // Imutable String still Changeable HOW ??????
    public static void main(String[] args ){
        String s1 = "pw java"; // Present in S.C.P
        s1=s1.concat("skill");// This String will create out of S.C.P because use inbuilt method or Reference variable
        System.out.println(s1);
        String s2 = new String("pw java");
        s2=s2.concat("skill");// Cause we assign or change or use reference variable and store the adress of ne String
        System.out.println(s2);

        String s3 ="Python"; // In S.C.P
        String s4 = "Python" + "with"; // Out of S.C.P withoout using new keyword because we use reference variable
        String s5 = "Python" + "with" + "dsa"; // Out of S.C.P withoout using new keyword because we use reference variable
        String s6 = s4 + s5;
        System.out.println(s3);
        System.out.println(s4);
        System.err.println(s5);
        System.err.println(s6);

    }
    
}
