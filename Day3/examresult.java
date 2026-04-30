import java.util.*;
public class examresult {
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your Mark: ");
       int mark = sc.nextInt();
       if (mark >=40){
        System.out.println("Passed the Exam");
       }
       else{
        System.out.println("Failed in Exam");
       }
    }
}

