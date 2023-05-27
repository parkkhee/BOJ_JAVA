import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        int n = Integer.parseInt(br.readLine());

        long[] planet = new long[n];
        stringTokenizer = new StringTokenizer(br.readLine());
        for(int i = 0;i < n ; i++){
            planet[i] = Long.parseLong(stringTokenizer.nextToken());
        }

        long velocity = planet[n-1];
        for(int i = n-2; i >= 0; i--){
            if(velocity < planet[i])
                velocity = planet[i];
            else if(planet[i] < velocity && velocity%planet[i] != 0)
                velocity = ((velocity / planet[i]) + 1) * planet[i];
        }
        
        System.out.println(velocity);
    }
}
