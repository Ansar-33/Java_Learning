import java.util.*;

public class scannerclass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Hi "+name); 

        System.out.println("Enter your Place: ");
        String place = sc.nextLine();
        System.out.println("Your Place is: "+place);

        System.out.println("Enter your State: ");
        String state = sc.nextLine();
        System.out.println("Your State is: "+state);

        System.out.println("Enter your Age: ");
        byte age = sc.nextByte();
        System.out.println("Your Age is: "+age);

        System.out.println("Enter your Contact Number: ");
        long phno = sc.nextLong();
        System.out.println("Your Contact number is: "+phno);

        System.out.println("Enter your CGPA: ");
        float cgpa = sc.nextFloat();
        System.out.println("Your Contact number is: "+cgpa);

        System.out.println("Enter your Salary: ");
        double salary = sc.nextDouble();
        System.out.println("Your Salary is: "+salary);

        System.out.println("Enter your E-mail: ");
        String email = sc.nextLine();
        System.out.println("Your E-Mail is: "+email);
    }
}
