public class str {
     
    public static void main(String [] args){
        String s = "abc";        //string literal
        String a = new String("abc");    //string object 
        System.out.println(s==a);       // compare reference
        System.out.println(s.equals(a));
        System.out.println(a.equals(s));
       


    }
}
