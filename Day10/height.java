import java.util.Scanner;
public class height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
        }
        int D = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            boolean tall = true;
            if (i - D >= 0 && H[i] <= H[i - D]) {
                tall = false;
            }
            if (i + D < N && H[i] <= H[i + D]) {
                tall = false;
            }
            if (tall) {
                sum += H[i];
            }
        }
        System.out.println(sum);
    }
}

