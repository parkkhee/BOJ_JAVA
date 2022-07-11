import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        FastReader fr = new FastReader(); 
        ArrayList<Integer> point = new ArrayList<>();
        
        int num = fr.nextInt();

        for(int i=0; i<num; i++){
          point.add(fr.nextInt());          
        }
        ArrayList<Integer> result = (ArrayList<Integer>) point.clone();
        Collections.sort(result);

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        for (int n : result) {
            if (!map.containsKey(n)) {
                map.put(n, idx++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int n : point) {
            sb.append(map.get(n)).append(" ");
        }

        System.out.println(sb);

                
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
