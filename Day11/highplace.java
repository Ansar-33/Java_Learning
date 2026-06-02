import java.util.*;
public class highplace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE:");
        int CS = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int EC = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int MECH = sc.nextInt();
        if(CS>EC && CS>MECH){
            System.out.println("Highest placement: CSE");
        }
        else if(EC>CS && EC>MECH){
            System.out.println("Highest placement: ECE");
        }
        else if(MECH>CS && MECH>EC){
            System.out.println("Highest placement: MECH");
        }
        else{
            System.out.println("All have same placements");
        }
        
    }
}
