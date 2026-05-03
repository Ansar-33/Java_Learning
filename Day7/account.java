import java.util.Scanner;

public class account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myaccount b = new myaccount();

        System.out.println("Enter your Pin: ");
        int pin = sc.nextInt();
        int pin_no = 2005;

        if (pin == pin_no) {

            int choice;

            do {
                System.out.println("\n1. Check Balance \n2. Deposit \n3. Withdraw \n0. Exit");
                System.out.println("Enter your choice:");
                choice = sc.nextInt();

                if (choice == 1) {
                    System.out.println("Your Current Balance is: " + b.getBalance());
                }
                else if (choice == 2) {
                    System.out.println("Enter Amount to Deposit: ");
                    double amt = sc.nextDouble();
                    b.deposit(amt);
                }
                else if (choice == 3) {
                    System.out.println("Enter Amount to Withdraw: ");
                    double withdW = sc.nextDouble();
                    b.withdw(withdW);
                }
                else if (choice == 0) {
                    System.out.println("Exiting");
                }
                else {
                    System.out.println("Please Enter a Valid Choice.");
                }

            } while (choice != 0);

        } else {
            System.out.println("Invalid Pin. Please Enter a Correct Pin.");
        }

        
    }
}

class myaccount{
    private double balance = 0.0;

    double getBalance(){
        return balance;
    }

    void deposit(double amount){
        balance += amount;
    System.out.println("New Balance: "+balance);
    }

    void withdw(double withdW){
        balance -= withdW;
    System.out.println("Balance After Withdraw: "+balance);
    }
}
