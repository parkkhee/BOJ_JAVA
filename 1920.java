import java.util.*;
import java.io.*;

public class Main {

    public static int lowerBound(int[] arr, int target, int start, int end){
      while(start<end){
        int mid = (start+end)/2;
        if(arr[mid] >= target)
          end = mid;
        else
          start = mid+1;        
      }
      return end;
    }

    public static int upperBound(int[] arr, int target, int start, int end){
      while(start<end){
        int mid = (start + end)/2;
        if(arr[mid] > target) end = mid;
        else start = mid+1;
      }
      return end;
    }

    public static int countByRange(int[] arr, int leftValue , int rightValue){
      int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
      int rightIndex = upperBound(arr, rightValue, 0, arr.length);
      return rightIndex - leftIndex;

    }

    public static void main(String[] args) {
        FastReader fr = new FastReader(); 
        
        int n = fr.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
          arr[i] = fr.nextInt();
        }

        Arrays.sort(arr);
               
        int m = fr.nextInt();
        for(int i=0; i< m; i++){
          int x = fr.nextInt();
          int result = countByRange(arr, x, x);
          if(result>=1) System.out.println(1);
          else System.out.println(0);          
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
