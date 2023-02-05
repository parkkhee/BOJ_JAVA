
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;
    static int[] rope;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        rope = new int[n];

        for (int i = 0; i < n; i++) {

            rope[i] = Integer.parseInt(br.readLine());

        }
        Arrays.sort(rope);

        for (int i = n-1; i >= 0; i--) {
            max = Math.max(max, rope[i] * (n-(i)));
        }

        System.out.println(max);

    }



}

