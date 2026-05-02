                               // Arrays Cloning //
// public class Arraysinjava {
//     public static void main(String[] args){
//         int arr[] = {1,2,3,4,5,6};
//         int b[] = arr.clone();                     // source and destination array should be of same type and size
//         for(int i=0;i<b.length;i++){
//             System.out.print(b[i]+" ");
//         }
//     }
// }





                          // Arrays.copyOf() method //


// import java.util.Arrays;
// public class Arraysinjava {
//     public static void main(String[] args){
//         int arr[]  = {1,2,3,4,5,6};
//         int b[] = Arrays.copyOf(arr, 6);     // source and destination array
//         for(int i=0;i<b.length;i++){
//             System.out.print(b[i]+" ");
//         }
//     }
// }



                          // System.arraycopy() method //
public class Arraysinjava {
    public static void main(String[] args){
        int arr[]  = {1,2,3,4,5,6};
        int b[] = new int[6];
        System.arraycopy(arr, 2, b, 2, 4); 
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}