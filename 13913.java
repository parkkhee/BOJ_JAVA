import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m;

    static boolean visited[] = new boolean[100001];


    public static void main(String[] args) throws Exception{

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        SB resultSB = bfs(0, n);

        System.out.println(resultSB.cnt);
        for (int n : resultSB.locarr) {
            System.out.printf(n+ " ");
        }

    }

    public static SB bfs(int cnt, int loc) {

        Deque<SB> dq = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(loc);
        dq.offer(new SB(cnt, loc, arr));
        visited[loc] = true;

        while (!dq.isEmpty()) {

            SB sb = dq.poll();

            if (sb.nowloc == m) {
                return sb;
            }

            if(f(sb.nowloc-1) && !visited[sb.nowloc-1] ){
                visited[sb.nowloc - 1] = true;
                List<Integer> arr2 = new ArrayList<>(sb.locarr); // 새 ArrayList 인스턴스 생성
                arr2.add(sb.nowloc - 1); // 새 리스트에 현재 위치를 추가
                dq.offer(new SB(sb.cnt+1, sb.nowloc-1, arr2));
            }

            if(f(sb.nowloc+1) && !visited[sb.nowloc+1] ){
                visited[sb.nowloc+1] = true;
                List<Integer> arr2 = new ArrayList<>(sb.locarr); // 새 ArrayList 인스턴스 생성
                arr2.add(sb.nowloc + 1); // 새 리스트에 현재 위치를 추가
                dq.offer(new SB(sb.cnt+1, sb.nowloc+1, arr2));
            }

            if(f(sb.nowloc*2) && !visited[sb.nowloc*2] ){
                visited[sb.nowloc*2] = true;
                List<Integer> arr2 = new ArrayList<>(sb.locarr); // 새 ArrayList 인스턴스 생성
                arr2.add(sb.nowloc * 2); // 새 리스트에 현재 위치를 추가
                dq.offer(new SB(sb.cnt+1, sb.nowloc*2, arr2));
            }


        }
        return new SB(0,0, new ArrayList<>());

    }

    public static boolean f(int loc) {
        if (loc >= 0 && loc <= 100000) {
            return true;
        }
        return false;
    }

    static class SB{

        int cnt;
        int nowloc;
        List<Integer> locarr;

        SB(int cnt, int nowloc, List<Integer> locarr) {
            this.cnt = cnt;
            this.nowloc = nowloc;
            this.locarr = locarr;
        }

    }


}
