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
        double g = rn.nextGaussian();
        System.out.println(g);
        
    }
}
