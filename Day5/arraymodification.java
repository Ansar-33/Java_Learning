class arraymodification {
    public static void main(String[] args) {
        int ra[] = new int[5];
        ra[0]=1;ra[1]=3;ra[2]=4;ra[3]=2;ra[4]=5;
        System.out.println("Array: ");
        for (int i = 0; i <ra.length; i++) {
            System.out.println(ra[i]);
        }
        ra[1]=18;
        System.out.println("Modified Array: ");
        for (int i = 0; i <ra.length; i++) {
            System.out.println(ra[i]);
        }
    }
}
