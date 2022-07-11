import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); 
        

        int num = fr.nextInt();

        HashSet hs = new HashSet<>();
        for(int i =0; i<num; i++){          
          hs.add(fr.nextLine());
        }

        ArrayList list = new ArrayList<>(hs);

        Collections.sort(list, new Comparator<String>(){
          
          public int compare(String s1, String s2){
            if(s1.length() < s2.length()){
              return s1.length() - s2.length();
            }
            else if(s1.length() > s2.length()){
              return 1;
            }
            else
              return s1.compareTo(s2);
          }
        });

        for(int i=0; i<list.size(); i++){
          System.out.println(list.get(i));
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
