import java.util.Scanner;
public class mathClass {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");                                //Enter num1
        float num1 = sc.nextFloat();

        System.out.print("Enter a num2: ");                                //Enter num2
        float num2 = sc.nextFloat();

        System.out.println("Enter value in Degrees: ");          
        double deg = sc.nextDouble();
        double radians = Math.toRadians(deg);

        System.out.println("Absolute Value: " + Math.abs(num1));              // Absolute value of num1
        System.out.println("Absolute Value: " + Math.abs(num2));              // Absolute value of num2

        System.out.println("Max: " + Math.max(num1, num2));                   // Maximum of num1 and num2
        System.out.println("Min: " + Math.min(num1, num2));                   // Minimum of num1 and num2

        System.out.println("Power: " + Math.pow(num1, num2));                 // num1 raised to the power of num2

        System.out.println("Square Root: " + Math.sqrt(num1));                // Square root of num1
        System.out.println("Square Root: " + Math.sqrt(num2));                // Square root of num2

        System.out.println("Cube Root: " + Math.cbrt(num1));                  // Cube root of num1
        System.out.println("Cube Root: " + Math.cbrt(num2));                  // Cube root of num2

        System.out.println("Round Up: " + Math.ceil(num1));                   // Round up of num1
        System.out.println("Round Up: " + Math.ceil(num2));                   // Round up of num2

        System.out.println("Round Down: " + Math.floor(num1));                // Round down of num1
        System.out.println("Round Down: " + Math.floor(num2));                // Round down of num2

        System.out.println("Nearest Integer: " + Math.round(num1));           // Nearest integer of num1
        System.out.println("Nearest Integer: " + Math.round(num2));           // Nearest integer of num2

        System.out.println("Sine Function: " + Math.sin(radians));            // Sine of radians
        System.out.println("Cosine Function: " + Math.cos(radians));          // Cosine of radians
        System.out.println("Tangent Function: " + Math.tan(radians));         // Tangent of radians
    }
}

