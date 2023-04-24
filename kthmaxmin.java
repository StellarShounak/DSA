import java.util.Arrays;
import java.util.Collections;


public class kthmaxmin {

  static void kthmax(Integer a[],int l)
  
  {
    Arrays.sort(a, Collections.reverseOrder());
    System.out.println(a[l-1]);

  }

  static void kthmin(Integer a[], int k)
  
  {
    Arrays.sort(a);
    System.out.println(a[k-1]);

  }



    public static void main(String[] args) {
        Integer []a={2,6,9,4,6,8,1};
        int k= 2;
        int l= 3;
        kthmax(a,l);
        kthmin(a,k);
    }
}
