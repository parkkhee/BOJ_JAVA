package test;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{  //틀린답,,
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int cost = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        for (int i = 0; i < n; i++) {
            visited[i] = true;
            f(i,i,0,0);
        }

        System.out.println(cost);


    }

    public static void f(int start, int now, int sum, int cnt) {

        if (cnt == n - 1) {
            if (map[now][start] > 0) {
                sum += map[now][start];
                cost = Math.min(cost, sum);
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i] && map[now][i] > 0) {
                visited[i] = true;
                sum += map[now][i];
                f(start, i, sum, cnt + 1);
                visited[i] = false;
            }
        }


    }



}

