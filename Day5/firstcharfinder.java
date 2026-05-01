import java.util.*;
public class firstcharfinder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        char firstchar = s.charAt(0);
        System.out.println("The first character of the string is: " +firstchar);
    }
}
