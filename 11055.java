package org.example;

import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        int N = Integer.parseInt(br.readLine());

        int dp[] = new int[N+1];
        int map[] = new int[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i=1; i<=N; i++) {
            map[i] = Integer.parseInt(st.nextToken());
            dp[i] = map[i];
        }

   
        int result = dp[1];

        for(int i=1; i<=N; i++) {
            for(int j=1; j<i; j++) {
                if(map[j] < map[i]) {
                    dp[i] = Math.max(dp[j]+map[i], dp[i]);
                    result = Math.max(result, dp[i]);
                }
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();
        br.close();
        bw.close();
    }

}
