public class callbyvalue {
    public static void main(String[] args) {
        callbyvalue2 o1 = new callbyvalue2();
        int a = 5;
        o1.change(a);         // Here the value is called by creating an object for the method.
        System.out.println("Outside method: " +a);
    }
}
class callbyvalue2 {
    void change(int x) {        // Here the value is received by datatype of int.
        x = x + 10;
        System.out.println("Inside method: " +x);
    }
}

