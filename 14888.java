package test;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int[] cal = new int[4];
    public static int n;
    public static int[] a;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        a = new int[n];

        st = new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(st.nextToken());

        }


        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            cal[i] = Integer.parseInt(st.nextToken());
        }

        ddd(a[0],1);
        System.out.println(MAX);
        System.out.println(MIN);


    }

    public static void ddd(int num, int idx) {

        if (idx == n) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int j = 0; j < 4; j++) {

            if (cal[j] > 0) {

                cal[j]--;

                switch (j) {
                    case 0:
                        ddd(num + a[idx], idx + 1);
                        break;
                    case 1:
                        ddd(num - a[idx], idx + 1);
                        break;
                    case 2:
                        ddd(num * a[idx], idx + 1);
                        break;
                    case 3:
                        ddd(num / a[idx], idx + 1);
                        break;
                }

                cal[j]++;


            }

        }


    }


}



