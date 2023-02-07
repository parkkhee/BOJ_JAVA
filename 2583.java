

import java.io.*;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m,k;
    static int[][] map;
    static ArrayList<Integer> ans = new ArrayList<>();
    static int[] movx = {-1,1,0,0};
    static int[] movy = {0,0,-1,1};
    static int cnt=0;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        map = new int[m][n];


        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int dx = Integer.parseInt(st.nextToken());
            int dy = Integer.parseInt(st.nextToken());

            for (int yy = y; yy < dy; yy++) {
                for (int xx = x; xx < dx; xx++) {

                    map[yy][xx] = 1;

                }
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (map[i][j] != 1) {
                    cnt=0;
                    dfs(i,j);
                    ans.add(cnt);
                }

            }
        }

        Collections.sort(ans);

        System.out.println(ans.size());
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i)+" ");
        }


    }

    public static void dfs(int a, int b) {

        cnt++;
        map[a][b] = 1;
        for (int i = 0; i < 4; i++) {

            if (cr(a + movx[i], b + movy[i]) && map[a + movx[i]][b + movy[i]] != 1) {

                dfs(a + movx[i],b + movy[i]);
            }

        }

    }

    public static boolean cr(int suma, int sumb) {

        if (suma >= 0 && suma < m && sumb >= 0 && sumb < n) {

            return true;

        }
        return false;

    }



}



