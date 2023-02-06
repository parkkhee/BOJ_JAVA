
import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,w,L;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < w; i++) {
            dq.offer(0);
        }


        st = new StringTokenizer(br.readLine());
        int we = Integer.parseInt(st.nextToken());
        int time=0;
        int sum=0;

        while (true) {
            time++;

            sum -= dq.poll();
            if (sum + we <= L) {

                dq.offer(we);
                sum += we;
                if(--n ==0) break;
                we = Integer.parseInt(st.nextToken());


            } else {
                dq.offer(0);
            }


        }

        time += dq.size();
        System.out.println(time);


    }

}



