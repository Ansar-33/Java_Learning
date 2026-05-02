import java.util.*;
public class patientidsearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Patient IDs: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();    
        } 
        int key;
        int temp = 0;
        System.out.println("Enter Patient ID to search: ");
        key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(key == arr[i]){
            temp = 1;
            System.out.println("Patient ID found");
            break;
        }
    }
        if(temp == 0){
            System.out.println("Patient ID not found");
        }
    }
}
