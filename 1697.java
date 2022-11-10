import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int num1 = Integer.parseInt(st.nextToken());
    int num2 = Integer.parseInt(st.nextToken());

    if (num1 == num2) {
      System.out.println(0);
      return;
    }
    boolean[] visited = new boolean[100001];
    visited[num1] = true;
    Queue<Integer> q = new LinkedList<>();
    q.add(num1);
    int cnt = 0;

    while (true) {
      int size = q.size();
      cnt++;
      for (int i = 0; i < size; i++) {
        int qrm = q.remove();
        visited[qrm] = true;
        if (num1 - 1 == num2 || num1 + 1 == num2 || num1 * 2 == num2) {
          System.out.println(cnt);
          return;
        }
        if (num1 - 1 >= 0 && !visited[num1 - 1]) {
          visited[num1 - 1] = true;
          q.add(num1 - 1);
        }
        if (num1 + 1 <= 100000 && !visited[num1 + 1]) {
          visited[num1 + 1] = true;
          q.add(num1 + 1);
        }
        if (num1 * 2 <= 100000 && !visited[num1 * 2]) {
          visited[num1 * 2] = true;
          q.add(num1 * 2);
        }

      }
    }

  }
}
