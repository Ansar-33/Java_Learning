import java.util.*;
public class salary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Salary:");;
        int sal = sc.nextInt();
        System.out.println("Enter the appraisal:");
        float app = sc.nextFloat();
        if(app>=1 && app<=3){
            System.out.printf("Salary is: %.2f%n", (sal+((10/100.0)*sal)));
        }else if(app>=3.1 && app<=4){
            System.out.printf("Salary is: %.2f%n", (sal+((25/100.0)*sal)));
        }else if(app>=4.1 && app<=5){
            System.out.printf("Salary is: %.2f%n", (sal+((30/100.0)*sal)));
        }else{
            System.out.println("Invalid Input");
        }
    }
}
