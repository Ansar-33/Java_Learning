import java.util.*;
public class luckynumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 1000 || n > 9999) {
            System.out.println("Invalid Number");
        }
        else{
        int sum = 0;
        int temp = n;
        while(temp>0){
            sum += temp%10;
            temp /= 10;
        }
        if(sum%3==0 || sum%5==0 || sum%7==0){
            System.out.println("Lucky Number");
        }
        else{
            System.out.println("Not a Lucky Number");
        }
    }
        
    }
}
