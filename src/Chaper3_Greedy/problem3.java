package Chaper3_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] card = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                card[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<N; i++){
            Arrays.sort(card[i]);
            if(max < card[i][0])
                max = card[i][0];
        }

        System.out.println(max);
    }
}
