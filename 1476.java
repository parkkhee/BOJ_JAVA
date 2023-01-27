
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int E;
    static int S;
    static int M;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        E = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int cnt=1;
        int e=1,s=1,m=1;

        while (e != E || s != S || m != M) {

            cnt++;
            e++;
            s++;
            m++;

            if (e > 15) {
                e=1;
            }
            if (s > 28) {
                s=1;
            }
            if (m > 19) {
                m=1;
            }
        }

        System.out.println(cnt);


    }


}



