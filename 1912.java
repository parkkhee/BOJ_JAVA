package test;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] dp;
    static int[] arr;
    static int max;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        arr = new int[n+1];
        dp = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {

            arr[i] = Integer.parseInt(st.nextToken());

        }

        dp[1] = arr[1];
        max = dp[1];

        re(n);

        System.out.println(max);

    }

    public static int re(int num) {

        if (dp[num] == null) {
            dp[num] = Math.max(dp[num - 1] + arr[num], arr[num]);

            max = Math.max(max, dp[num]);
        }

        return dp[num];

    }


}

