public class reversep2 {
     
    
     public static void rvereseArray(int arr[], int start, int end)
     {
         int temp;
           
         while (start < end)
         {
             temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;
             start++;
             end--;
         }

         System.out.println("Reversed array is: \n");
         for (int k = 0; k < end; k++) {
             System.out.println(arr[k]);
         }

     }    




     public static void main(String args[]) {
         
        int arr[] = {1, 2, 3, 4, 5, 6};
        
        rvereseArray(arr, 0, 5);
        

        
    }
}