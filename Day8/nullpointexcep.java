public class nullpointexcep {
    public static void main(String[] args) {
        String studentName = null;
        try {
            System.out.println(studentName.length());
        } 
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Occurred");
        }
        catch (Exception e){
            System.out.println("Exception Occured");
        }
    }
}
