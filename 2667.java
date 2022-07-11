import java.util.*;
import java.io.*;


public class Main {

    public static int[][] map = new int[25][25];
    public static boolean[][] visited = new boolean[25][25];
    public static int n;
    public static int[] dx = {0, 0, -1, 1};
    public static int[] dy = {1, -1, 0, 0};
    public static int count=0;
    public static int[] apart = new int[25*25];
    public static int apartNum=0;
    

    public static void dfs(int a, int b){

      apart[apartNum]++;
      visited[a][b] = true;

      for(int i=0; i<4; i++){
        int x = a + dx[i];
        int y = b + dy[i];

        if(x>=0 && y>=0 && x<n && y<n){
          if(map[x][y] == 1 && !visited[x][y]){
            dfs(x,y);
          }
        }
      }
      
      
    }

    public static void main(String[] args) {
        FastReader fr = new FastReader();

        n = fr.nextInt();

        map = new int[n][n];
        visited = new boolean[n][n];

        //map을 받는 방법
        for(int i=0; i<n; i++){
          String input = fr.next();
          for(int j=0; j<n; j++){
            map[i][j] = input.charAt(j)-'0';
          }
        }

        for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
            if(!visited[i][j] && map[i][j]==1){
              apartNum++;
              dfs(i,j);
            }
              
          }
        }

        Arrays.sort(apart);

        System.out.println(apartNum);
        for(int i=0;i<apart.length;i++){
          if(apart[i]==0){
          }else{
            System.out.println(apart[i]);
          }
          
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
