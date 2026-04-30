// Program to find a character is vowel or a consonant 
// import java.util.*;
// public class conditionalst {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Character: ");
//         char ch = sc.next().charAt(0);
//         if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
//             ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//             System.out.println("Entered Character is Vowel");
//         }
//         else{
//             System.out.println("Entered Character is Consonant");
//         }
//     }
// }



// Program to find a given number is Positive or Negative or Z
// import java.util.*;
// public class conditionalst {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a Number: ");
//         int num = sc.nextInt();
//         if(num > 0){
//             System.out.println("Entered Number is Positive Number");
//         }else if (num < 0){
//             System.out.println("Entered Number is Negative Number");
//         }else{
//             System.out.println("Zero");
//         }
//     }
// }


// Program to check Pass or Fail
// import java.util.*;
// public class conditionalst {
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your Mark: ");
//        int mark = sc.nextInt();
//        if (mark >=40){
//         System.out.println("Passed the Exam");
//        }
//        else{
//         System.out.println("Failed in Exam");
//        }
//     }
// }


// Program to find Larger Number
// import java.util.*;
// public class conditionalst {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         if (num1 > num2) {
//             System.out.println("Larger number is: " +num1);
//         } else if (num2 > num1) {
//             System.out.println("Larger number is: " +num2);
//         } else {
//             System.out.println("Equal");
//         }
//     }
// }


// Program to find Vote Eligiblity
import java.util.*;
public class conditionalst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("Not Eligible to Vote");
        }
}
}