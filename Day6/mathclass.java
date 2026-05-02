import java.util.Scanner;
public class mathclass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();

        System.out.println("Enter value in Radians: ");
        double rad1 = sc.nextDouble();

        System.out.println("Absolute Value: " + Math.abs(num1));
        System.out.println("Absolute Value: " + Math.abs(num2));

        System.out.println("Max: " + Math.max(num1, num2));
        System.out.println("Min: " + Math.min(num1, num2));

        System.out.println("Power: " + Math.pow(num1, num2));

        System.out.println("Square Root: " + Math.sqrt(num1));
        System.out.println("Square Root: " + Math.sqrt(num2));

        System.out.println("Cube Root: " + Math.cbrt(num1));
        System.out.println("Cube Root: " + Math.cbrt(num2));

        System.out.println("Round Up: " + Math.ceil(num1));
        System.out.println("Round Up: " + Math.ceil(num2));

        System.out.println("Round Down: " + Math.floor(num1));
        System.out.println("Round Down: " + Math.floor(num2));

        System.out.println("Nearest Integer: " + Math.round(num1));
        System.out.println("Nearest Integer: " + Math.round(num2));

        System.out.println("Sine Function: " + Math.sin(rad1));
        System.out.println("Cosine Function: " + Math.cos(rad1));
        System.out.println("Tangent Function: " + Math.tan(rad1));
    }
}
