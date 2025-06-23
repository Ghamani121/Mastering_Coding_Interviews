// I have the craziest pattern for you’ll:
// N = 6
// 1      2      3     4     5      6
// 20     21     22    23    24     7
// 19     32     33    34    25     8
// 18     31     36    35    26     9
// 17     30     29    28    27     10
// 16     15     14    13    12     11


//While loop for when condition ends
//While x<=36 i.e, n*n
//Four for loops
//Increasing col,static row,rowStart++
//Increasing row,static col,coEndl--
//Decreasing col,static row,rowEnd--
//Decreasing row,static col,colStart++
//Var x is our number to print

public class spiralPattern {

    public static void PatternPrinter(int n) {

        int rowStart = 0, colStart = 0, rowEnd = n - 1, colEnd = n - 1;
        int[][] a = new int[n][n];
        int x = 1;

        while (x < (n * n + 1)) {

            for (int i = colStart; i <= colEnd; i++) {
                a[rowStart][i] = x;
                x++;
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                a[i][colEnd] = x;
                x++;
            }
            colEnd--;

            for (int i = colEnd; i >= colStart; i--) {
                a[rowEnd][i] = x;
                x++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                a[i][colStart] = x;
                x++;
            }
            colStart++;
        }

        //print the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PatternPrinter(6);
    }
}