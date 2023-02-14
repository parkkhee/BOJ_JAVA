import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] ener;
    static ArrayList<Integer> arr = new ArrayList<>();
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        ener = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }


        f(0, arr);

        System.out.println(max);


    }

    public static void f(int sum, ArrayList<Integer> arrf) {

        if (arrf.size() == 2) {
            max = Math.max(max, sum);
            return;
        }

        for (int i = 1; i < arrf.size()-1; i++) {
            int tmp = arrf.get(i);
            int mul = arrf.get(i - 1) * arrf.get(i+1);
            arrf.remove(i);
            f(sum+mul,arrf);
            arrf.add(i,tmp);
        }


    }

}
