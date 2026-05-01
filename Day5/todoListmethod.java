import java.util.*;

public class todoListmethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TodoList t0 = new TodoList();

        System.out.print("Enter task 1: ");
        String t1 = sc.nextLine();

        System.out.print("Enter task 2: ");
        String t2 = sc.nextLine();

        System.out.print("Enter task 3: ");
        String t3 = sc.nextLine();

        t0.addtask(t1, t2, t3);
    }
}

class TodoList {
    void addtask(String t1, String t2, String t3) {

        System.out.println("Your To-Do List: ");

        if (!t1.isBlank())
            System.out.println("1. " + t1);

        if (!t2.isBlank())
            System.out.println("2. " + t2);

        if (!t3.isBlank())
            System.out.println("3. " + t3);
    }
}
