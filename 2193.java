package test;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static long[] dp;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        dp = new long[91];

        dp[1] = 1;
        dp[2] = 1;

        if (n == 1) {
            System.out.println(dp[1]);
            System.exit(0);
        }
        if (n == 2) {
            System.out.println(dp[2]);
            System.exit(0);
        }

        for (int i = 3; i <= n; i++) {

            dp[i] = dp[i - 1] + dp[i - 2];

        }

        System.out.println(dp[n]);


    }

}



