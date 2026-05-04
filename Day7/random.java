import java.util.Random;

public class random {
    public static void main(String[] args) {
        String arr[] = {"Arun", "Bala", "Cathy", "Divya", "Eshan"};
        Random r = new Random();

        int index = r.nextInt(arr.length);
        System.out.println("Winner is: " + arr[index]);
    }
}
