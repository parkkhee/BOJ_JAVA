import java.util.*;
import java.io.*;


public class Main {


    public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드

        int n = fr.nextInt();

        ArrayList<Long> dist = new ArrayList<>();
        ArrayList<Long> price = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            dist.add(fr.nextLong());
        }

        for(int i=0; i<n; i++){
            price.add(fr.nextLong());
        }

        long minprc = price.get(0);
        long sum=0;

        for(int i=0; i<n-1; i++){
            if(minprc > price.get(i)){
                minprc = price.get(i);
            }

            sum += minprc* dist.get(i);
        }

        System.out.println(sum);


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
