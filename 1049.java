package test;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m;
    static int minSix = Integer.MAX_VALUE;
    static int minOne = Integer.MAX_VALUE;
    static int six,one;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            six = Integer.parseInt(st.nextToken());
            one = Integer.parseInt(st.nextToken());

            minSix = Math.min(minSix, six);
            minOne = Math.min(minOne, one);
        }

        int result;

        if(minSix >= minOne*6) {
            result = minOne * n;
        } else {

            int s = n / 6;
            int remainder = n % 6;
            if(remainder != 0) {
                result = Math.min(minSix * s + remainder * minOne, minSix * (s + 1));
            } else {
                result = minSix * s;
            }
        }

        System.out.println(result);
    }




}



