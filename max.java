public class max
{
public static void main(String[] args) {
    int  []a= {2,8,6,4,3,10};
    int max, min;
    if(a[0]>a[1])
    {
        max=a[0];
        min=a[1];
    }
    else{
        max=a[1];
        min=a[0];
    }

    for(int i=2; i<=a.length-1; i++)
    {
        if(a[i]>max)
        {
            max=a[i];
        }

        else if (a[i]<min)
        {
           min=a[i];
        }
    }
    System.out.println("max= "+ max + "min= "+ min);
}
}