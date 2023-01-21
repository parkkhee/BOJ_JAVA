package test;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] weight;
    static int[] height;
    static int[] rank;
    static int num;


    public static void main(String[] args) throws IOException {

        num = Integer.parseInt(br.readLine());

        height = new int[num];
        weight = new int[num];
        rank = new int[num];


        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());

        }

        for (int i = 0; i < num; i++) {

            re(i);  //신경 잘 쓰자,,

        }

        for (int i = 0; i < num; i++) {

            System.out.print(rank[i] + " ");

        }

    }

    public static void re(int n) {
        int cnt=1;

        for (int i = 0; i < num; i++) {

//            System.out.println(i + " " +cnt);

            if (n == i) {
                continue;
            }

            if (weight[n] < weight[i] && height[n] < height[i]) {

                cnt++;

            }

        }

        rank[n]=cnt;



    }




}

