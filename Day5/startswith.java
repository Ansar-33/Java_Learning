import java.util.*;
public class startswith{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        if(s.startsWith("Java")){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
