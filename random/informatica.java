public class informatica {

    public static int possibleWays(int n, int m) {
        if (n == 0) return 1;       // base case: exactly reached stair n
        if (n < 0) return 0;        // base case: invalid step

        int total = 0;
        for (int i = 1; i <= m; i++) {
            total += possibleWays(n - i, m);  // try all jumps from 1 to m
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 4, m = 2;
        System.out.println(possibleWays(n, m));  // Output: 7
    }
}
