package Chapter5_DFSBFS;

import java.util.Scanner;

public class problem1 {
    private static int N, M;
    private static int[][] map;
    private static boolean[][] visit;
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1 , 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();
        map = new int[N][M];
        visit= new boolean[N][M];

        sc.nextLine();
        for(int i=0; i<N; i++){
            String line = sc.nextLine();
            for(int j=0; j<line.length(); j++){
                map[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        int result = 0;
        for(int i=0; i<N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0 && !visit[i][j]) {
                    checkIceCream(i, j);
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }

    public static void checkIceCream(int y, int x){
        if(visit[y][x])
            return;
        visit[y][x] = true;
        for(int i=0; i<4; i++){
            int fx = x + dx[i];
            int fy = y + dy[i];
            if(fx>=0 && fy>=0 && fx<M && fy <N){
                if(map[fy][fx] == 0 &&!visit[fy][fx])
                    checkIceCream(fy, fx);
            }
        }
    }
}
