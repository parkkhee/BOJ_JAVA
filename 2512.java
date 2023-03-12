package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m;
    static int[] budget;
    public static void main(String[] args) throws Exception{

        n = Integer.parseInt(br.readLine());
        budget = new int[n];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            budget[i] = Integer.parseInt(st.nextToken());
            max = Math.max(budget[i], max);
            min = Math.min(budget[i], min);
        }

        m = Integer.parseInt(br.readLine());

        long mid = (min + max) / 2;
        long start = min;
        long end = max;
        long rs = Integer.MIN_VALUE;

        while (start<=end){
            long sum=0;

            for (int i = 0; i < budget.length; i++) {

                if (budget[i] <= mid) {
                    sum+=budget[i];
                }else{
                    sum+=mid;
                }

            }

            if (sum <= m) {
                rs = rs>=mid ? rs:mid;
                start = mid+1;
                mid = (start+end)/2;
            } else if (sum > m) {
                end = mid-1;
                mid = (start+end)/2;
            }


        }

        System.out.println(rs);

    }


}

