public class arithexcep{
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Divide by Zero not Possible");
        }
        catch (Exception e){
            System.out.println("Exception Occured");
        }
    }
}
