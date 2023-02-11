import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n;
    static boolean[] visit;
    static int cnt;
    static int[] num = {1, 5, 10, 50};

    public static void main(String[] args) throws IOException {
        
        n = Integer.parseInt(br.readLine());

        visit = new boolean[50 * 20 + 1];
        f();
        System.out.println(cnt);
    }

    private static void f() {
        for (int i = 0; i <= n; i++) { // 1
            for (int j = 0; j <= n - i; j++) { //5
                for (int k = 0; k <= n - i - j; k++) { // 10
                    int l = n - i - j - k; // 50
                    int sum = i * 1 + j * 5 + k * 10 + l * 50;
                    if (!visit[sum]) {
                        cnt++;
                        visit[sum] = true;
                    }
                }
            }
        }
    }
}
