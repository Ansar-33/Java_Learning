import java.util.Arrays;
import java.util.Random;

public class randomClass {
    public static void main(String[] args) {

        Random rn = new Random();

        int studentId = rn.nextInt(1000);
        System.out.println("Student ID: " +studentId);

        double marks = rn.nextDouble() * 100;
        System.out.println("Marks: " +marks);

        float attendance = rn.nextFloat() * 100;
        System.out.println("Attendance: " +attendance);

        boolean f = rn.nextBoolean();
        System.out.println("Status: " + (f ? "Pass" : "Fail"));

        long regNo = rn.nextLong();
        System.out.println("Registration Number: " +regNo);

        double g = rn.nextGaussian() * 10;
        System.out.println("Performance Score: " +g);

        byte[] b = new byte[5];
        rn.nextBytes(b);
        System.out.println("Random Bytes: " + Arrays.toString(b));

        System.out.println("5 Random Numbers:");
        rn.ints(5).forEach(System.out::println);
    }
}
