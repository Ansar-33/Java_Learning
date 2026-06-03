import java.util.*;
public class charsum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '<'){
                int sum = 0;
                i++;
                while(s.charAt(i) != '>'){
                    sum = sum + s.charAt(i) - 'a' + 1;
                    i++;
                }
                s1 = s1+sum;
            }
            else{
                s1 = s1 + s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}
