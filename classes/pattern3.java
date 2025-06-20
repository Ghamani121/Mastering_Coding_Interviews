public class pattern3
{
    public static void main(String[] args)
    {
        int a=1,b=1;
        for(int i=0;i<35;i++)
        {
            if(i%7==0) System.out.println();
            System.out.print(a+" ");
            a+=b;  //increment or decrement based on 5 or 1
            if(a==5) b=-1;
            if(a==1) b=1;
        }
    }
}