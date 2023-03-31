import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n=0,m=0;
    static long[] dp;
    public static void main(String[] args) throws Exception{

        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            m = Integer.parseInt(br.readLine());

            if (m <= 3) {
                switch (m) {
                    case 1:
                        System.out.println(1);
                        break;
                    case 2:
                        System.out.println(2);
                        break;
                    case 3:
                        System.out.println(4);
                        break;
                }
                continue;
            }

            dp = new long[m];
            dp[0] = 1;
            dp[1] = 2;
            dp[2] = 4;
            dp[3] = 7;
            if (m >= 5) {
                for (int j = 4; j < m; j++) {
                    dp[j] += (dp[j - 3] + dp[j - 2] + dp[j - 1])%1000000009;
                }
            }

            System.out.println(dp[m-1]%1000000009);



        }


    }

}
