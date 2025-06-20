// Design a single function that prints the following different results:
// 1 2 2 3 3 3 4 4 4 4

// 5 6 6 7 7 7

// -2 -1 -1 0 0 0 1 1 1 1 2 2 2 2 2

// 10 11 11 12 12 12

// 0 1 1

// 7

// Note: the numbers in the sequence will always be increasing by 1, try to recognise the pattern in the outputs.


public class pattern4
{
    public void Pattern(int start, int end)
    {
        int count = 1;
        for (int i = start; i <= end; i++)
        {
            for (int j = 1; j <= count; j++)
            {
                System.out.print(i + " ");
            }
            count++;
        }
        System.out.println(); // to move to the next line after pattern
    }

    public static void main(String[] args)
    {
        pattern4 obj = new pattern4();
        obj.Pattern(1, 4);       
    }
}
