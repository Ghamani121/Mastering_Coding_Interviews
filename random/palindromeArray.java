public class palindromeArray
{
    public static void main(String[] args) {
        int arr[]={ 1,2,3,2,1};
        palindromeArrayy(arr);
    }
    public static void palindromeArrayy(int arr[])
    {
        for(int i=0;i<arr.length/2;i++)
        {
            if(arr[i]!=arr[arr.length-i-1]) 
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}