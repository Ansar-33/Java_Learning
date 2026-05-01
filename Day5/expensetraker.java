import java.util.*;
public class expensetraker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tracker t = new Tracker(); 
        System.out.println("Enter the product name (0 to stop)");
        String prod = sc.nextLine();

        while (!prod.equals("0")) {
            System.out.println("Enter the amount");
            double amt = sc.nextDouble();
            sc.nextLine(); 
            t.addExpense(amt);
            System.out.println("Enter the product name (0 to stop)");
            prod = sc.nextLine();
        }  
    }
}

class Tracker {
    double total = 0;
    void addExpense(double cost) {
        total = total + cost;
        System.out.println("Total expense: " + total);
    }
}