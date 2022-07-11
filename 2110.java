import java.util.*;
import java.io.*;

public class Main {

//    public static int upperBound(int[] arr, int target, int start, int end){
//
//        while(start<end){
//            int mid = (start + end)/2;
//            if(arr[mid]>target){
//                end = mid;
//            }else{
//                start=mid+1;
//            }
//        }
//
//        return end;
//    }
    public static int[] wifi;

    public static int withc(int target){

        int cnt=1;  // 첫 번째 집은 무조건 설치한다고 가정
        int lastlocation = wifi[0];

        for(int i=0; i<wifi.length; i++){
            int location = wifi[i];
            if(location - lastlocation >= target){
                cnt++;
                lastlocation = wifi[i];
            }
        }

        return cnt;

    }

    public static void main(String[] args) {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드

        int n = fr.nextInt();
        int c = fr.nextInt();

        wifi = new int[n];

        for(int i=0; i<n; i++){
            wifi[i] = fr.nextInt();
        }

        Arrays.sort(wifi);

        int start = 1;
        int end = wifi[n-1] - wifi[0] +1;
        
        //Upper Bound

        while(start<end){
            int mid = (start + end)/2;
            if(withc(mid) < c){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        /*
         *  Upper Bound는 탐색 값을 초과하는 첫 번째 값을 가리키므로,
         *  1을 빼준 값이 조건식을 만족하는 최댓값이 된다.
         */
        System.out.print(start-1);


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
