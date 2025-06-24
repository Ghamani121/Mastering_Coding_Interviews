public class armstrong {
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int sum=0,count=0;
        //count the number of digits
        while(n>0)
        {
            n=n/10;
            count++;
        }
        n=temp;
        //calculate the sum
        while(n>0)
        {
            int power=1;
            int rem=n%10;
            for(int i=0;i<count;i++)
            {
                power*=rem;
            }
            sum+=power;
            n=n/10;
        }
        //compare the answers
        if(temp==sum)
        {
            System.out.println("armstrong number");
        }
        else
        {
            System.out.println("not armstrong number");
        }
    }
}
