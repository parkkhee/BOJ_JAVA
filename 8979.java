
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m;
    static int[][] rank;
    static int[][] check = new int[1][4];

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        rank = new int[n][4];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {

                rank[i][j] = Integer.parseInt(st.nextToken());

                if (rank[i][0] == m) {
                    check[0][j] = rank[i][j];
                }

            }
        }
        int cnt=1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 4; j++) {
                if(rank[i][0] == check[0][0]) break;
                if (check[0][j] < rank[i][j]) {
                    cnt++;
                    break;
                } else if (check[0][j] > rank[i][j]) {
                    break;
                }
            }
        }

        System.out.println(cnt);

    }




}

