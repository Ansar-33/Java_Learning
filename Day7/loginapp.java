import java.util.Scanner;
public class loginapp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        login l = new login();
        System.out.println("Enter your Username: ");
        String name = sc.nextLine();
        System.out.println("Enter your Password: ");
        String pass = sc.nextLine();
        boolean result = l.checkData(name, pass);
        if (result == true){
            System.out.println("Valid Login");
        }
        else{
            System.out.println("Login Failed. Please Enter Correct Username and Password.");
        }
    }
}


class login{
    
    private String username = "Ansar";
    private String password = "ansar@786"; 
    boolean checkData(String name, String pass){
        if(name.equals(username) && pass.equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
