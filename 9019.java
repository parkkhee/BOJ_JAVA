import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Queue<Integer> q = new LinkedList<>();
            boolean[] visited = new boolean[10000]; 
            String[] dslr = new String[10000]; 


            q.add(a); 
            visited[a] = true; 
            Arrays.fill(dslr,  ""); 


            while (!q.isEmpty() && !visited[b]) {
                int now = q.poll(); 

                int D = (2 * now) % 10000; 
                int S = now == 0 ? 9999 : now - 1; 
                int L = (now % 1000) * 10 + now / 1000; 
                int R = (now % 10) * 1000 + now / 10; 

                if (!visited[D]) {
                    q.add(D); 
                    visited[D] = true; 
                    dslr[D] = dslr[now] + "D";
                }

                if (!visited[S]) {
                    q.add(S);
                    visited[S] = true;
                    dslr[S] = dslr[now] + "S";
                }

                if (!visited[L]) {
                    q.add(L);
                    visited[L] = true;
                    dslr[L] = dslr[now] + "L";
                }

                if (!visited[R]) {
                    q.add(R);
                    visited[R] = true;
                    dslr[R] = dslr[now] + "R";
                }
            }
            System.out.println(dslr[b]);
        }
    }
}
