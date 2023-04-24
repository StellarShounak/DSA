public class unio {
    public static void arrange(int a[],int b[], int n, int m)
    {
          int i=0;
          int j=0;
          while(i<n & j<n)
          {
              if(a[i]<a[j])
              {
                System.out.println(a[i++]);

              }
              else if(a[j]<a[i])
              {
                System.out.println(a[j++]);

              }
              else
              {
                System.out.println(i++);
                j++;
              }
          }
    }
    
    public static void main(String[] args) {
        int []a={3,6,8,4,3};
        int []b={4,9,1,2,4,6,7};
        int n=a.length;
        int m=b.length;
        arrange(a,b,n,m);
    }
}
