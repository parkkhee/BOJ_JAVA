

import java.io.*;
import java.nio.Buffer;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n;

    public static void main(String[] args) throws IOException {

        n = Integer.parseInt(br.readLine());

        int bcnt=0,rcnt=0,min=0;

        String str = br.readLine();
        for (int i = 0; i < n; i++) {

            if (i == 0) {

                if (str.charAt(i) == 'B') {
                    bcnt++;
                } else {
                    rcnt++;
                }

            } else {

                if (str.charAt(i - 1) == str.charAt(i)) {
                    continue;
                } else {
                    if (str.charAt(i) == 'B') {
                        bcnt++;
                    } else {
                        rcnt++;
                    }
                }


            }


        }

        min = Math.min(bcnt, rcnt);


        System.out.println(min+1);


    }

}



