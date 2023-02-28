package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] str = new String[n];
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            str[i] = st.nextToken();
            num[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < m; i++) {

            int nn = Integer.parseInt(br.readLine());

            int start=0;
            int end=n;
            int mid=0;

            while (start <= end) {

                mid = (start + end) / 2;

                if (num[mid] < nn) {
                    start = mid + 1;
                } else {
                    end = mid-1;
                }

            }

            System.out.println(str[mid]);


        }



    }

}
