import java.util.Random;

class Ball {

    public static void main(String[] args) {
        Random r1 = new Random(10);
        Random r2 = new Random(10);
        if (r1.nextInt() == r2.nextInt()) {
            System.out.println("Jack");
        } else {
            System.out.println("Queen");
        }
    }
}
