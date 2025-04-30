import java.util.*;
public class interview {
    //array of integers-1
    //poitive,- and 0
    //no reccurrance
    //-5000 to 5000
    //sort the array

   public static void main(String[] args) {
    
    int[] arr={3,9,7,0,4,-2,-7};
    sorting(arr);

   }
   public static void sorting(int[] arr){
    //    for(int i=0;i<arr.length;i++)
    //    {
    //     for(int j=i+1;j<arr.length;j++)
    //     {
    //         if(arr[i]>arr[j])
    //         {
    //             int temp=arr[i];
    //             arr[i]=arr[j];
    //             arr[j]=temp;
    //         }
    //     }
    //    }
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
   }    
}

//o(n^2)
//o(nlogn)
