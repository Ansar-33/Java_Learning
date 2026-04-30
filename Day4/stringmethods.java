public class stringmethods {
    public static void main(String[] args){
        String s1= " Hello";
        String s2 = " ";
        String s3 = "Hello";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.strip());
        System.out.println(s1.repeat(5));
        String h=s1.trim();
        String l=s1.strip();
        System.out.println(h);
        System.out.println(l);
        System.out.println(s3.replace("Hello","HELLO"));
        System.out.println(s1.startsWith(" Hello"));
        System.out.println(s2.endsWith("Hello"));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.contains("ell"));
        
    }
}
