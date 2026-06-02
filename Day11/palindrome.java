import java.util.*;
public class palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int rev = 0, rem, temp;
        temp = num;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp/=10;
        }
        if(num == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}
