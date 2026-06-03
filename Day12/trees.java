import java.util.*;
public class trees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
        int tot = 0;
        int prod = 1;
        for(int j=k;j>=1;j--){
            prod = prod*j;
            tot = tot + prod;
        }
        ans = ans + tot;
    }
    System.out.println(ans);
    }
}
