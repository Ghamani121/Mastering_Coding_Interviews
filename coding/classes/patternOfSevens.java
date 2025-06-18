public class patternOfSevens {

    public static void main(String[] args) {
        pattern();
    }
    public static void pattern()
    {
        for(int i=0;i<35;i++)
        {
            if(i%7==0) System.out.println();
            System.out.print(i%4+"");
        }
    }
}