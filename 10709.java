import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.dgc.VMID;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int h, w;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());

        char[][] map = new char[h][w];
        int[][] result = new int[h][w];

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < w; j++) {

                map[i][j] = br.readLine().charAt(j);
                if (map[i][j] == '.') {
                    result[i][j] = -1;
                }
                if (map[i][j] == 'c') {
                    result[i][j] = 0;
                }

            }

        }

        int cloud = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (result[i][j] == 0) {
                    for (int k = j + 1; k < w; k++) {
                        if (result[i][k] == 0) {
                            cloud = 0;
                            break;
                        } else {
                            cloud += 1;
                            result[i][k] = cloud;
                        }

                    }
                }
            }
            cloud = 0;
        }

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }



    }


}
