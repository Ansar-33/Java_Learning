import java.util.*;
public class parceltracking {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Parcel Tracking Numbers: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr[3] = 33;
        System.out.println("Parcel Tracking Numbers after Update: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        }
    }
