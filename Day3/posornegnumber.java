import java.util.*;
public class posornegnumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Entered Number is Positive Number");
        }else if (num < 0){
            System.out.println("Entered Number is Negative Number");
        }else{
            System.out.println("Zero");
        }
    }
}
