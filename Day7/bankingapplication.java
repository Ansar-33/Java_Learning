import java.util.Scanner;
public class bankingapplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank b = new bank();
        System.out.println("Enter your Pin: ");
        int pin = sc.nextInt();
        int pin_no = 2005;
        if (pin == pin_no){
            System.out.println("1. Check Balance \n 2.Deposit \n 3.Withdraw ");
            System.out.println("Enter your choice:");
            int choice = sc.nextInt();
            if(choice == 1){
                System.out.println("Your Current Balance is: "+b.getBalance());
            }
            else if(choice == 2){
                System.out.println("Enter Amount to Deposit: ");
                double amt = sc.nextDouble();
                b.deposit(amt);
            }
            else if(choice == 3){
                System.out.println("Enter Amount to Withdraw: ");
                double withdW = sc.nextDouble();
                b.withdw(withdW);
            }
            else{
                System.out.println("Please Enter a Valid Choice.");
                
            }
        }     
        else{
            System.out.println("Invalid Pin. Please Enter a Correct Pin.");
            
        }
}
}

class bank{
    private double balance = 3333.00;

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
