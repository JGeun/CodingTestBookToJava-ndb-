package Chaper3_Greedy;

import java.util.*;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
        int[] numArr = new int[N];
        for(int i=0; i<N; i++)
            numArr[i] = sc.nextInt();

        Arrays.sort(numArr);

        int first = numArr[N-1];
        int second = numArr[N-2];

        int count = M/(K+1) * K;
        count += M % (K+1);

        int result = count*first;
        result += (M - count)*second;

        System.out.println(result);
    }
}
