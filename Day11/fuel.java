import java.util.*;
public class fuel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of litres:");
        int l = sc.nextInt();
        if(l<=0){
            System.out.println("Invalid input");
            return;
        }
        else{
        System.out.println("Enter the distance:");
        int d = sc.nextInt();
        float c = (float)(l)/(float)(d)*100;
        System.out.println("100km Fuel Consumption: " + c);
        double miles = (float)(d)*0.6214;
        double gallons = (float)(l)*0.2642;
        System.out.println("Miles/Gallons: " + miles/gallons);
        }
    }
}