import java.io.*;
import java.util.*;

public class luckynumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());

        for (int t_i = 0; t_i < T; t_i++) {
            long l = Long.parseLong(br.readLine().trim());
            long r = Long.parseLong(br.readLine().trim());
            long out_ = solve(l, r);
            wr.println(out_);
        }

        wr.close();
        br.close();
    }
    static long solve(long l, long r) {
    long result = 0;
    for (long x = l; x <= r; x++) {
        long s = (long) Math.sqrt(x);  // floor(sqrt(x))
        if (x % s == 0) {
            result++;
        }
    }
    return result;
}


    // static long solve(long l, long r) {
    //     if (l > r) return 0;

    //     long result = 0;
    //     long sMin = (long) Math.sqrt(l);
    //     long sMax = (long) Math.sqrt(r) + 1;

    //     for (long s = sMin; s <= sMax; s++) {
    //         if (s == 0) continue;

    //         long lower = s * s;
    //         long upper = (s + 1) * (s + 1) - 1;

    //         long a = Math.max(l, lower);
    //         long b = Math.min(r, upper);

    //         if (a > b) continue;

    //         long firstK = (a + s - 1) / s; // ceil(a / s)
    //         long lastK = b / s;            // floor(b / s)

    //         if (firstK > lastK) continue;

    //         result += (lastK - firstK + 1);
    //     }

    //     return result;
    // }
}
