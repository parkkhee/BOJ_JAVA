import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int n, maxValue;

        int[] dp, p, t;

        n = Integer.parseInt(st.nextToken());
        max = Integer.MIN_VALUE;
        dp = new int[n + 2];
        p = new int[n];
        t = new int[n];

      
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }
        

        for (int i = n - 1; i >= 0; i--) {
            if (t[i] + i <= n) {
                dp[i] = Math.max(p[i] + dp[t[i] + i], max);
                max = dp[i];
            } else {
                dp[i] = max;
            }
        }

        System.out.println(max);
    }
}
