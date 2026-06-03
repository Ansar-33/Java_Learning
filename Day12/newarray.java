public class newarray {
    public static void main(String[] args){
        int N = 4;
        int []A = {3,5,2,8};
        int []B = {3,3,7,8};
        int []C = new int[N];
        for(int i=0;i<N;i++){
            if(A[i]==B[i]){
                C[i] = A[i];
            }else{
                C[i] = Math.max(A[i],B[i]);
            }
        }
        
        for(int i=0;i<N;i++){
            System.out.print(C[i] + " ");
        }
    }
}
