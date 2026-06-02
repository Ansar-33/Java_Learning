class validdate {
    public static void main(String[] args) {
        int n;
        int c = 0;
    String []arr = {"05-06-26","10-06-26","15-06-26","20-06-26","25-06-26"};
        String sd = "10-06-26";
        String ed = "20-06-26";
        for(int i=0;i<arr.length;i++){
            if (arr[i].compareTo(sd) >= 0 &&
                arr[i].compareTo(ed) <= 0) {
                    c++;
        }
        }
        System.out.println(c);
    }
}