import java.util.Scanner;

public class energy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int[] A = new int[n];
         for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < n; i++) {

            int start = Math.max(0, i - A[i]);

            for (int j = start; j <= i; j++) {
                total += A[j];
            }
        }

        System.out.println(total);

        
    }
}