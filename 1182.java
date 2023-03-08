package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] num;
    static int cnt=0;
    static int s,n;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        num = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            num[i] = Integer.parseInt(st.nextToken());

        }


    }

    public void f(int number){

        if (num[number] == s) {
            cnt++;
        }

        for (int i = number+1; i < n; i++) {

        }

    }
}
