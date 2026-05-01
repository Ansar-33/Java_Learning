class Test {
    int value;
}

public class callbyreference {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.value = 10;

        System.out.println("Before: " + obj.value);

        change(obj);

        System.out.println("After: " + obj.value);
    }

    static void change(Test t) {
        t.value = t.value + 10;
        System.out.println("Inside method: " + t.value);
    }
}