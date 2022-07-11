import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        FastReader fr = new FastReader(); 
        String str = fr.nextLine();
        String[] minusArr = str.split("\\-");
        int result = 0;
        for (int i = 0; i < minusArr.length; i++) {
            String[] plusArr = minusArr[i].split("\\+");
            for (int j = 0; j < plusArr.length; j++) {
                if (i == 0) {
                    result += Integer.parseInt(plusArr[j]);
                } else {
                    result -= Integer.parseInt(plusArr[j]);
                }
            }
        }
        System.out.println(result);

                
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
