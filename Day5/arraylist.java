import java.util.*;
public class arraylist {
    public static void main(String [] args){
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> str = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);
        arr.set(1,7);
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);
        str.add("Mohammed");
        str.add("Ansar");
        str.add("S");
        System.out.println(str);
        str.remove(0);
        System.out.println(str);
    }
}
