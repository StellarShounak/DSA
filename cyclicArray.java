public class cyclicArray {
    public static void main(String[] args) {
        int []a={2,5,7,4,3,8,9};

         int x = a[a.length-1];
         for(int i=a.length-1; i>0; i--)
         {
            a[i]=a[i-1];

         }
        a[0]=x;

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
    }
}
