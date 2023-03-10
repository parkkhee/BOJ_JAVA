import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long n;
    static long m;
    static long realcnt;
    public static void main(String[] args) throws Exception{

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());


        dfs(n, 0);

        System.out.println(-1);

    }

    public static void dfs(long start, long cnt){

        if (start > m) {
            return;
        } else if (start == m) {
            realcnt = cnt+1;
            System.out.println(realcnt);
            System.exit(0);
        }

        String str;
        str = String.valueOf(start);
        str+="1";

        dfs(Long.parseLong(str),cnt+1);
        dfs(start * 2, cnt + 1);

    }
}
