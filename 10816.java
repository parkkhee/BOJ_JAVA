import java.util.*;
import java.io.*;



public class Main {

    public static int upperBound(int[] arr, int target, int start, int end){
      while(start < end){
        int mid = (start + end)/2;
        if(target < arr[mid]){
          end = mid;
        }
        else{
          start = mid+1;
        }
      }
      return end;
    }

    public static int lowerBound(int[] arr, int target, int start, int end){
      while(start<end){
        int mid = (start+end)/2;
        if(target <= arr[mid]){
          end = mid;
        }else{
          start = mid+1;
        }
      }
      return end;
    }

    public static int countByRange(int[] arr, int leftValue, int rightValue){
      int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
      int rightIndex = upperBound(arr, rightValue, 0, arr.length);

      return rightIndex - leftIndex;
    }

    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        
        int n = fr.nextInt();
        int[] M = new int[n];

        for(int i =0; i<n; i++){
          M[i] = fr.nextInt();
        }

        Arrays.sort(M);
        
        StringWriter stringWriter = new StringWriter();
        BufferedWriter buffWriter = new BufferedWriter(stringWriter);

        int n2 = fr.nextInt();
        for(int i=0; i<n2; i++){
          int search = fr.nextInt();
          int result = countByRange(M, search, search);
            buffWriter.write(result + " ");
        }

        // Flush the buffer writer
        buffWriter.flush();
        System.out.println(stringWriter.getBuffer());
                
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
