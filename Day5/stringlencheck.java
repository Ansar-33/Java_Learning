import java.util.*;
public class stringlencheck {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        if(s.length() >= 5){
            System.out.println("String is Long");
        }
        else{
            System.out.println("String is Short");
        }
    }
}
