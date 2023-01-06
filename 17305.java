import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        ArrayList<Integer> small = new ArrayList<>();
        ArrayList<Integer> big = new ArrayList<>();

        for(int i=0; i<N; i++) {
            input = br.readLine().split(" ");
            if(input[0].equals("3"))
                small.add(Integer.parseInt(input[1]));
            else
                big.add(Integer.parseInt(input[1]));
        }

        small.sort(Comparator.reverseOrder());
        big.sort(Comparator.reverseOrder());

        long[] s = new long[small.size()+1];
        long[] b = new long[big.size()+1];
        for(int i=1; i<s.length; i++)
            s[i] = s[i-1] + small.get(i-1);
        for(int i=1; i<b.length; i++)
            b[i] = b[i-1] + big.get(i-1);

        int x = Math.min(W/3, small.size());
        long max = 0;

        while(x>=0) {
            int y = Math.min((W-3*x)/5, big.size());

            if(max<s[x]+b[y])
                max = s[x]+b[y];
            x--;
        }

        System.out.println(max);
    }
}
