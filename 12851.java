package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int me, end;
    static boolean[] visited= new boolean[100001];
    static int cnt=0;
    static int fs=Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception{

        st = new StringTokenizer(br.readLine());
        me = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        if (me == end) {
            System.out.println(0);
            System.out.println(1);
            return;
        }

        bfs(me, 0);

        System.out.println(fs);
        System.out.println(cnt);
    }

    public static void bfs(int n, int s) {

        Deque<Node> dq = new LinkedList<>();

        dq.offer(new Node(n,s));
        visited[n] = true;

        while(!dq.isEmpty()){

            Node node = dq.poll();

            int nown = node.x;
            int nows = node.s;

//            if (fs < nows) {
//                System.out.println(fs);
//                System.out.println(cnt);
//                return;
//            }

            if (nown == end) {
                if (fs == Integer.MAX_VALUE) {
                    fs = nows;
                }
                if (fs == nows) {
                    cnt++;
                }
                continue;
            }

            if (cr(nown - 1) && !visited[nown - 1]) {
                if(nown-1 != end) visited[nown - 1] = true;
                dq.offer(new Node(nown - 1, nows + 1));
            }
            if (cr(nown + 1) && !visited[nown + 1]) {
                if(nown+1 != end) visited[nown + 1] = true;
                dq.offer(new Node(nown + 1, nows + 1));
            }
            if (cr(nown * 2) && !visited[nown * 2]) {
                if(nown*2 != end) visited[nown * 2] = true;
                dq.offer(new Node(nown * 2, nows + 1));
            }


        }


    }

    public static boolean cr(int x){
        if (x >= 0 && x <= 100000) {
            return true;
        } else return false;
    }


    public static class Node{

        public int x;
        public int s;

        public Node(int x, int s) {
            this.x = x;
            this.s = s;
        }


    }


}





