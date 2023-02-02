
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m;
    static char[][] map;
    static boolean[][] visited;
    static int white = 0;
    static int blue = 0;
    static Deque<Node> dq = new LinkedList<>();
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[m][n];
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            String str = "";
            str += br.readLine();
            for (int j = 0; j < n; j++) {

                map[i][j] = str.charAt(j);

            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (visited[i][j] == false) {

                    if (map[i][j] == 'W') {
                        int num = bfs(i, j, 'W');
                        white += num * num;
                    } else {
                        int num = bfs(i, j, 'B');
                        blue += num * num;
                    }

                }

            }
        }

        System.out.println(white + " " + blue);


    }

    public static int bfs(int x, int y, int c) {

        dq.offer(new Node(x, y));
        int cnt = 1;
        visited[x][y] = true;

        while (!dq.isEmpty()) {

            Node node = dq.poll();
            for (int i = 0; i < 4; i++) {

                if (checkR(node.x + dx[i], node.y + dy[i]) && !visited[node.x + dx[i]][node.y + dy[i]]) {

                    if (c == map[node.x + dx[i]][node.y + dy[i]]) {
                        visited[node.x + dx[i]][node.y + dy[i]] = true;
                        cnt++;
                        dq.offer(new Node(node.x + dx[i], node.y + dy[i]));
                    }

                }


            }


        }

        return cnt;


    }

    public static boolean checkR(int a, int b) {

        if (a >= 0 && a < m && b >= 0 && b < n) {
            return true;
        }
        return false;

    }




}

