import java.util.*;
public class arrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
            System.out.println("Enter elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }

