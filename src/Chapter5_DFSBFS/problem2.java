package Chapter5_DFSBFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem2 {
    private static int N, M;
    private static int[][] map;
    private static int[] dx = {-1, 1, 0 ,0};
    private static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); M = sc.nextInt();
        map = new int[N+1][M+1];
        sc.nextLine();
        for(int i=0; i<N; i++){
            String line = sc.nextLine();
            for(int j=0; j<line.length(); j++){
                map[i+1][j+1] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        checkMaze();
        System.out.println(map[N][M]);
    }

    public static void checkMaze(){
        Queue<UserPoint> queue = new LinkedList<>();
        queue.offer(new UserPoint(1, 1));

        while(!queue.isEmpty()){
            UserPoint point = queue.poll();
            for(int i=0; i<4; i++){
                int fy = point.getY()+dy[i];
                int fx = point.getX()+dx[i];

                if(fx>=1 && fx<=M && fy>=1 && fy<=N){

                    if(map[fy][fx] == 1){
                        map[fy][fx] = map[point.getY()][point.getX()]+1;
                        queue.offer(new UserPoint(fx, fy));
                    }
                }
            }
        }
    }

    public static class UserPoint{
        int x, y;

        public UserPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
