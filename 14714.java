import java.util.*;
 
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int h, w;
    static int[] height;
 
    public static void main(String[] args) {
        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
 
        height = new int[w];
      
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < w; i++) {
            height[i] = Integer.parseInt(st.nextToken());
        }
 
        int result = 0;
        for(int i = 1; i < w - 1; i++) { 
            int left = 0;
            int right = 0;
 
            for(int j = 0; j < i; j++) {
                left = Math.max(height[j], left);
            }
 
            for(int j = i + 1; j < w; j++) {
                right = Math.max(height[j], right);
            }
 
            if(height[i] < left && height[i] < right) result += Math.min(left, right) - height[i];
        }
        System.out.println(result);
    }
}
