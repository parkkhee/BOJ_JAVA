import java.util.*;
import java.io.*;



public class Main {


    public static long dpp(int N){

      if(dp[N] == -1){
        dp[N] = dpp(N-5)+dpp(N-1);
      }
      return dp[N];
  
    }

    public static long[] dp = new long[101];

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); 

        int n = fr.nextInt();
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        dp[4] = 2;
        dp[5] = 2;
        
        for(int i=6; i<dp.length; i++){
          dp[i] = -1;
        }

        for(int i=0; i<n; i++){
          int m = fr.nextInt();
          System.out.println(dpp(m));
        }
        
                
    }

    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        public FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        public FastReader(String s) throws FileNotFoundException { br = new BufferedReader(new FileReader(new File(s))); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}
