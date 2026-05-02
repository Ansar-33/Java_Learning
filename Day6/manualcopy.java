import java.util.Scanner;
public class manualcopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = new double[5];
        double[] copy = new double[5];
        System.out.println("Enter Product Prices: ");
        for (int i = 0; i < 5; i++) {
            prices[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            copy[i] = prices[i];
        }
        System.out.println("Copied Product Prices: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(copy[i] + " ");
        }

        
    }
}