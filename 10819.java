package test;

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] a;
    static boolean[] visited;
    static int[] selected;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        a = new int[n];
        visited = new boolean[n];
        selected = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            a[i] = Integer.parseInt(st.nextToken());

        }

        f(0);
        System.out.println(max);

    }

    public static void f(int num) {

        if (num >= n) {
            max = Math.max(result(), max);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                selected[num] = a[i];
                f(num + 1);
                visited[i] = false;
            }
        }


    }

    public static int result() {

        int sum=0;
        for (int i = 0; i < n - 1; i++) {
            sum += Math.abs(selected[i] - selected[i + 1]);
        }

        return sum;

    }

}



