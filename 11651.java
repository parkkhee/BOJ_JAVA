import java.util.*;
import java.io.*;

class Point implements Comparable<Point>{
  public int x;
  public int y;
  public Point(int x, int y){
    this.x=x;
    this.y=y;
  }
  @Override
  public int compareTo(Point other){
    if(this.y != other.y){
        return this.y - other.y;
    }
      
    else{
        return this.x - other.x;
    }
      
  }
  @Override
  public String toString(){
    return x + " " + y;
  }

}

public class Main {
    public static void main(String[] args) throws IOException {
        FastReader fr = new FastReader(); // 문제 해결 소스 코드
        ArrayList<Point> ls = new ArrayList<>();

        int num = fr.nextInt();

        for(int i =0; i<num; i++){
          int x = fr.nextInt();
          int y = fr.nextInt();

          ls.add(new Point(x, y));
        }

        Collections.sort(ls);

        for(int i=0; i<num; i++)
          System.out.println(ls.get(i));
                
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
