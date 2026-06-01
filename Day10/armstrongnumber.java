import java.util.*;
public class armstrongnumber {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int sum = 0;
int temp = n;
while (temp > 0) {
int digit = temp % 10;
sum += Math.pow(digit, 3);
temp /= 10;
}
if (sum == n) {
System.out.println(n + " is an Armstrong number.");
} else {
System.out.println(n + " is not an Armstrong number.");
}
}
}