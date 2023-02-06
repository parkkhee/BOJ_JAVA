
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m;
    static int[] num;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        num = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            num[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(num);

        int cnt=0;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {

                if (i == j) {
                    System.out.println(cnt);
                    System.exit(0);
                }

                if (num[i] + num[j] == m) {
                    cnt++;
                }
                if (num[i] + num[j] < m) {
                    break;
                }

            }
        }


    }

}



