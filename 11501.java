package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int T;
    static StringBuilder sb;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = null;

    public static void main(String[] args) throws Exception {
        SetData();
        System.out.println(sb);
    }

    private static void SetData() throws Exception {

        T = Integer.parseInt(br.readLine());
        sb = new StringBuilder();

        for( int i = 0 ; i < T ; i++ ) {
            int N = Integer.parseInt(br.readLine());
            long stocks[] = new long[N];
            st = new StringTokenizer(br.readLine());
            for( int j = 0 ; j < N ; j++ ) {
                stocks[j] = Integer.parseInt(st.nextToken());
            }

            long max = 0;
            long answer = 0;
            for( int j = N-1 ; j >= 0 ; j-- ) {
                if(stocks[j] > max) {	
                    max = stocks[j];
                }else {
                    answer += max - stocks[j];	
                }
            }
            sb.append(answer + "\n");
        }
    }
    
}
