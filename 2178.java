import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int min = 0;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];

        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {

                map[i][j+1] = str.charAt(j) - '0';


            }
        }

        bfs(1,1);

        System.out.println(min);


    }

    public static class Node {

        int x;
        int y;
        int cnt;

        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

    }

    public static boolean cr(int x, int y) {

        if (x > 0 && x <= n && y > 0 && y <= m) {
            return true;
        } else {
            return false;
        }

    }

    public static void bfs(int x, int y) {

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Deque<Node> dq = new LinkedList<>();

        dq.add(new Node(x, y,1));
        visited[x][y] = true;

        while (!dq.isEmpty()) {

            Node node = dq.poll();

            if (node.x == n && node.y == m) {
                if (min == 0) {
                    min = node.cnt;
                } else {
                    min = Math.min(min, node.cnt);
                }

            }

            for (int i = 0; i < 4; i++) {

                if (cr(node.x + dx[i], node.y + dy[i]) && !visited[node.x + dx[i]][node.y + dy[i]]
                        && map[node.x + dx[i]][node.y + dy[i]] == 1) {
                    visited[node.x + dx[i]][node.y + dy[i]] = true;
                    dq.add(new Node(node.x + dx[i], node.y + dy[i], node.cnt+1));
                }
            }


        }

    }
}
