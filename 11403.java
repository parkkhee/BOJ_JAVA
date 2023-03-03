package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int[][] answer;
    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n];
        answer = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }

        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                visited[j] = false;
            }

            for (int j = 0; j < n; j++) {

                if (map[i][j] == 1 && !visited[j]) {
                    dfs(i,j);
                }

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(answer[i][j]+" ");

            }
            System.out.println();
        }


    }
    public static void dfs(int i, int j){

        visited[j] = true;
        answer[i][j] = 1;

        for (int k = 0; k < n; k++) {
            if (map[j][k] == 1 && !visited[k]) {
                visited[k] = true;
                dfs(i, k);
            }

        }

    }


}
