public class stringbuilder {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        String firstName = "Arun";
        String city = "Chennai";
        String hobby = "Cricket";
 
        sb.append(firstName);
        sb.append(" FROM ");
        sb.append(city);
        sb.append(" LOVES ");
        sb.append(hobby);

        System.out.println(sb.toString().toUpperCase());
    }
}