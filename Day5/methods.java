import java.util.*;
public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine(); 
        todolist t1 = new todolist();
        t1.addtask(a);
    }
}
class todolist{
    void addtask(String task) {
        if(task.isBlank()) {
        System.out.println("Please enter a task");
        return;
    }
    else{
        System.out.println("Task is: "+task);
        System.out.println("Thank you for Entering the task");
    }

}
}
