package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static int min = Integer.MAX_VALUE;
    static boolean[] visited = new boolean[100001];
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if(N == K){
            System.out.println(0);
        }else {
            bfs(N);
            System.out.println(min);
        }
    }

    static void bfs(int start) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(start, 0));
        visited[start] = true;

        while (!q.isEmpty()) {
            Node now_node = q.poll();

            if(now_node.x == K) {
                min = Math.min(min, now_node.time);
            }

            int next_node;
            next_node = now_node.x * 2;
            if(next_node < 100001 && !visited[next_node]) {
                visited[next_node] = true;
                q.offer(new Node(next_node, now_node.time));
            }

            next_node = now_node.x - 1;
            if(next_node >= 0 && !visited[next_node]) {
                visited[next_node] = true;
                q.offer(new Node(next_node, now_node.time + 1));
            }

            next_node = now_node.x + 1;
            if(next_node < 100001 && !visited[next_node]) {
                visited[next_node] = true;
                q.offer(new Node(next_node, now_node.time + 1));
            }
        }
    }
}
class Node {
    int x;
    int time;

    public Node(int x, int time) {
        this.x = x;
        this.time = time;
    }
}
