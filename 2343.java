import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.dgc.VMID;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m;
    static int[] minute;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int start =Integer.MIN_VALUE;
        int end = 0;
        minute = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

            minute[i] = Integer.parseInt(st.nextToken());
            end += minute[i];
            start = Math.max(start, minute[i]);

        }

        int mid;

        while (start <= end) {

            mid = (start + end) / 2;

            int cnt = f(mid);

            if (cnt > m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }


        }

        System.out.println(start);



    }

    public static int f(int mid) {

        int sum=0;
        int cnt=0;

        for (int i = 0; i < n; i++) {

            if (sum + minute[i] > mid) {
                cnt++;
                sum=0;
            }
            sum += minute[i];

        }

        if (sum != 0) {
            return ++cnt;
        }
        return cnt;

    }




}
