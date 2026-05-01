import java.util.*;
public class linearsearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();    
        } 
        int key;
        int temp = 0;
        System.out.println("Enter key to search: ");
        key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
        if(key == arr[i]){
            temp = 1;
            System.out.println("Key found at index: " +i);
            break;
        }
    }
        if(temp == 0){
            System.out.println("Key not found");
        }
    }
}
