import java.util.*;
public class librarybooksort {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
            System.out.println("Enter Library Book IDs: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
        }
        int temp;
        for ( int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted Library Book IDs in Ascending order: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }


