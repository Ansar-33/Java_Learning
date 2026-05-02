public class stringbuffer {
    public static void main(String [] args){
        StringBuffer sb = new StringBuffer("Ansar");
        System.out.println(sb);

        sb.append("S");
        System.out.println(sb);

        sb.replace(0, 3, "ANS");  
        System.out.println(sb);

        sb.insert(3, "S");
        System.out.println(sb);

        sb.delete(1, 4);  
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        char ch = sb.charAt(3);
        System.out.println(ch);

        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb);
        System.out.println(sb.capacity());
        

    }
}

