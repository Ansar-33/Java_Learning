public class arrayexcep {
    public static void main(String[] args) {
        int [] arr = {85,90,78};
        try {
            System.out.println(arr[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        }
        catch (Exception e){
            System.out.println("Exception Occured");
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


// public class arrayexcep {
//     public static void main(String[] args) {

//         try {
//             String str[] = null; 
//             System.out.println(str.length);
//          } 
//          catch (NullPointerException e) {
//              System.out.println("Null Pointer Exception");
//          }
//          catch (Exception e){
//              System.out.println("Exception Occured");
//         }
         
//     }
//  }


