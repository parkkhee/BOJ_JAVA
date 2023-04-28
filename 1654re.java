import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long line[] = new long[k];
        long max = 0;
        for(int i=0; i<k; i++) {
            line[i] = Integer.parseInt(br.readLine());
            max = Math.max(line[i], max); // 가장 긴 랜선 max에 저장
        }
        max++; // 가장 긴 랜선이 최대 길이가 될 수 있으므로 +1
        long min = 0, mid=0, cnt;
        while(min < max){ // 이분 탐색
            mid = (max+min) / 2; // 자를 랜선의 길이
            cnt = 0;
            for(int i=0; i<k; i++)
                cnt += line[i] / mid; // 랜선의 개수 저장
            if(cnt < n) // mid길이로 랜선을 잘랐을 때 랜선이 n개보다 적게 나온 경우
                max = mid;
            else // mid길이로 랜선을 잘랐을 때 랜선이 n개 이상 나온 경우
                min = mid+1;
        }
        System.out.print(min-1); // n개의 랜선이 만들어지는 최대 랜선 길이
    }
}
