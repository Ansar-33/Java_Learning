import java.util.Arrays;
import java.util.Random;
public class randomclass {
    public static void main(String[] args) {
        Random rn =  new Random();

        int n = rn.nextInt(10);
        System.out.println(n);

        boolean f = rn.nextBoolean();
        System.out.println(f);

        double d = rn.nextDouble();
        System.out.println(d);

        double g = 10+(2*rn.nextGaussian());
        System.out.println(g);

        byte[] b = new byte[5];
        System.out.println(Arrays.toString(b));
        
        rn.nextBytes(b);
        System.out.println(Arrays.toString(b));
        
    }
}
