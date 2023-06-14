import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
 
public class Main {
 
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("input.txt")));
        String[] str = br.readLine().split(" ");
 
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        str = br.readLine().split(" ");

        Queue<Integer> pos_q = new PriorityQueue<Integer>((x, y) -> y - x);
        Queue<Integer> neg_q = new PriorityQueue<Integer>();
 
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(str[i]) > 0) {
                pos_q.add(Integer.parseInt(str[i]));
            } else {
                neg_q.add(Integer.parseInt(str[i]));
 
            }
        }
        int element;
        int max = 0;
        int sum = 0;

        while (!pos_q.isEmpty()) {

            for (int i = 0; i < M; i++) {

                if (pos_q.isEmpty())
                    continue;
                element = pos_q.poll();
 

                if (i == 0) {
                    sum += Math.abs(element);
                    if (Math.abs(element) > max) {
                        max = Math.abs(element);
                    }
                }
            }
        }

        while (!neg_q.isEmpty()) {

            for (int i = 0; i < M; i++) {
             
                if (neg_q.isEmpty())
                    continue;
                element = neg_q.poll();
                
                if (i == 0) {
                    sum += Math.abs(element);
                    if (Math.abs(element) > max) {
                        max = Math.abs(element);
                    }
                }
            }
        }
        System.out.println(sum * 2 - max);
    }
}
