package test;

import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static class Node {
        int now_i, now_j, cnt;

        public Node(int now_i, int now_j, int cnt) {
            this.now_i = now_i;
            this.now_j = now_j;
            this.cnt = cnt;
        }


    }

    public static boolean cri(int now_i, int now_j, int fi, int fj) {

        if (now_i >= 0 && now_j >= 0 && now_i < fi && now_j < fj) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        int[] run_i = {2,1,-1,2,1,-1,-2,-2};
        int[] run_j = {1,2,2,-1,-2,-2,-1,1};

        int test_case = Integer.parseInt(br.readLine());

        for (int i = 0; i < test_case; i++) {
            int ii = Integer.parseInt(br.readLine());

            boolean[][] visited = new boolean[ii][ii];

            st = new StringTokenizer(br.readLine());
            int si = Integer.parseInt(st.nextToken());
            int sj = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int fi = Integer.parseInt(st.nextToken());
            int fj = Integer.parseInt(st.nextToken());

            Deque<Node> dq = new LinkedList<>();

            dq.offer(new Node(si, sj, 0));

            while (!dq.isEmpty()) {

                Node node = dq.poll();

                if (node.now_i == fi && node.now_j == fj) {
                    System.out.println(node.cnt);
                    break;
                }

                for (int j = 0; j < run_i.length; j++) {

                    if (cri(node.now_i + run_i[j], node.now_j + run_j[j], ii, ii) && !visited[node.now_i + run_i[j]][node.now_j + run_j[j]]) {
                        dq.offer(new Node(node.now_i + run_i[j], node.now_j + run_j[j], node.cnt+1));
                        visited[node.now_i + run_i[j]][node.now_j + run_j[j]] = true;
                    }

                }


            }


        }


    }


}



