  public class krotation
{
public static void main(String[] args){

  int[] a={1,2,3,1,2};
  int k=2;
  int n=a.length;
  int count=0;
  for(int i=0;i<n;i++){
      if(a[i]==a[(i+k)%n]){
          count++;
      }
  }
  System.out.println(count);
}
}

