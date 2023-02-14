import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int testcase;
    static int[][] map;
    static boolean[][] visited;
    static int cnt=0;
    static int m,n;


    public static void main(String[] args) throws IOException {

        testcase = Integer.parseInt(br.readLine());

        while (testcase > 0) {

            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < k; i++) {

                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map[x][y] = 1;


            }

            cnt=0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (map[i][j] == 1 && !visited[i][j]) {
                        visited[i][j] = true;
                        bfs(i, j);
                    }

                }
            }


            System.out.println(cnt);
            testcase--;

        }

    }

    public static class Node {
        int x;
        int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }


    public static void bfs(int x, int y) {

        Deque<Node> dq = new LinkedList<>();
        dq.add(new Node(x,y));

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        while (!dq.isEmpty()) {

            Node node = dq.poll();
            for (int i = 0; i < 4; i++) {

                if (cr(node.x + dx[i], node.y + dy[i]) && !visited[node.x + dx[i]][node.y + dy[i]]
                        && map[node.x + dx[i]][node.y + dy[i]] == 1) {
                    visited[node.x + dx[i]][node.y + dy[i]] = true;
                    dq.add(new Node(node.x + dx[i], node.y + dy[i]));
                }

            }

        }

        cnt++;

    }

    public static boolean cr(int dx, int dy) {

        if (dx >= 0 && dy >= 0 && dx < m && dy < n) {
            return true;
        } else {
            return false;
        }

    }



}
