package Chapter4_Realization;

import java.util.Scanner;

public class problem4 {
    private static int[][] map;
    private static boolean[][] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int cy = sc.nextInt(), cx= sc.nextInt(), cway = sc.nextInt();
        map = new int[N][M];
        visit = new boolean[N][M];
        visit[cy][cx] = true;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j] = sc.nextInt();
            }
        }

        int result = 1;
        int count = 0;
        while(true){
            cway -=1;
            if(cway == -1)
                cway = 3;
            count += 1;
            int fy = cy;
            int fx = cx;
            switch(cway){
                case 0:
                    fy -= 1;
                    if(fy>=0 && map[fy][fx] == 0 && !visit[fy][fx]){
                        cy = fy;
                        result += 1;
                        visit[fy][fx] = true;
                        count = 0;
                    }
                    break;
                case 1:
                    fx += 1;
                    if(fx<M && map[fy][fx] == 0 && !visit[fy][fx]){
                        cx = fx;
                        result += 1;
                        visit[fy][fx] = true;
                        count = 0;
                    }
                    break;
                case 2:
                    fy += 1;
                    if(fy<N && map[fy][fx] == 0 && !visit[fy][fx]){
                        cy = fy;
                        result += 1;
                        visit[fy][fx] = true;
                        count = 0;
                    }
                    break;
                case 3:
                    fx -= 1;
                    if(fx>=0 && map[fy][fx] == 0 && !visit[fy][fx]){
                        cx = fx;
                        result += 1;
                        visit[fy][fx] = true;
                        count = 0;
                    }
                    break;
            }
            if(count == 4){
                break;
            }
        }
        System.out.println(result);
    }
}
