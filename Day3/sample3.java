import java.util.Scanner;
public class sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num > 90){
            System.out.println("Grade: O");
        }
        else if (num > 75){
            System.out.println("Grade: A");
        }
        else if (num > 60){
            System.out.println("Grade: B");
        }
        else if(num >= 50){
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: U");
        }
    }
}
