
public class stringbuffer{
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Order Placed");
        sb.append(" -> Packed");
        sb.append(" -> Shipped");
        sb.append(" -> Delivered");

        System.out.println(sb.toString());
    }
}