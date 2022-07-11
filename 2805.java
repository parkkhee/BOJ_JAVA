import java.util.*;
import java.io.*;



public class Main {

    

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); 
        
        int n = fr.nextInt();
        int m = fr.nextInt();

        int[] arr = new int[n];
        int max=(int) -1e9;

        for(int i=0; i<n; i++){
          arr[i] = fr.nextInt();
          max = Math.max(max, arr[i]);
        }

        
      
        int end = max;
        int start =0;
        
        int result =0;
               

        while(start<=end){
          int mid = (start+end)/2;
          long total = 0; 
          for(int i=0; i<n; i++){
            if(arr[i]>mid)
              total += arr[i] - mid;
          }

          if(total<m){
            end = mid-1;
          }else{
            start = mid+1;
            result = mid;
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
