import java.util.Scanner;
public class coursesearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] courses = new String[n];
        for(int i = 0; i < n; i++){
            courses[i] = sc.nextLine();
        }
        String key = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(key.equals(courses[i])){
                System.out.println("Course is available");
            }
        }
        System.out.println("Course is not available");
    }
}
