import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n,m;
    static int num1,num2;
    static boolean[] visited;
    static HashMap<Integer, ArrayList<Integer>> arr = new HashMap<>();
    static int cnt=1;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        num1 = Integer.parseInt(st.nextToken());
        num2 = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());


        visited = new boolean[n + 1];


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (!arr.containsKey(x)) {
                arr.put(x, new ArrayList<>());
            }
            if (!arr.containsKey(y)) {
                arr.put(y, new ArrayList<>());
            }

            arr.get(x).add(y);
            arr.get(y).add(x);

        }

        visited[num1] = true;
        if (!arr.get(num1).contains(num2)) {

            for (int i = 0; i < arr.get(num1).size(); i++) {
                visited[arr.get(num1).get(i)] = true;
                f(arr.get(num1).get(i), 2);
                visited[arr.get(num1).get(i)] = false;
            }

        }

        System.out.println(-1);


    }

    public static void f(int find, int cnt) {

        if (arr.get(find).contains(num2)) {
            System.out.println(cnt);
            System.exit(0);
        }

        for (int i = 0; i < arr.get(find).size(); i++) {
            if(!visited[arr.get(find).get(i)]){
                visited[find] = true;
                f(arr.get(find).get(i), cnt + 1);
                visited[find] = false;
            }

        }

    }

}
