package test;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int r,c,n;
    static boolean[][] visited;
    static int[][] board;

    public static void main(String[] args) throws IOException {

        st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        visited = new boolean[r][c];
        board = new int[r][c];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                String s = "";
                s += str.charAt(j);
                if (s.equals(".")) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 2;
                }

            }
        }

        int sec=1;
        String[][] result = new String[r][c];

        if (n == 1) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (board[i][j] == 1) {
                        result[i][j] = ".";
                    } else {
                        result[i][j] = "O";
                    }
                }

            }


            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.printf(result[i][j]);
                }
                System.out.println();

            }
            return;
        }

        int[] dirh = {-1, 1, 0, 0};
        int[] dirw = {0, 0, -1, 1};


        while (n>sec){
            sec++;

            if (sec % 2 == 0) {

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        board[i][j] = board[i][j]+1;
                    }
                }


            } else if (sec % 3 == 0) {

                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < c; j++) {
                        if (board[i][j] == 3) {
                            board[i][j] = 1;
                            for (int k = 0; k < 4; k++) {
                                int nowh = i + dirh[k];
                                int noww = j + dirw[k];
                                if (f(nowh, noww) && !visited[nowh][noww] && board[nowh][noww]==2) {
                                    visited[i + dirh[k]][j + dirw[k]] = true;
                                    board[nowh][noww] = 1;
                                }
                            }
                        }
                    }
                }
                visited = new boolean[r][c];
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 1) {
                    result[i][j] = ".";
                } else {
                    result[i][j] = "O";
                }
            }

        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.printf(result[i][j]);
            }
            System.out.println();
        }
        return;

    }

    public static boolean f(int i, int j) {
        if (i >= 0 && j >= 0 && i<=r && j>=c) {
            return true;
        }
        return false;
    }
}


