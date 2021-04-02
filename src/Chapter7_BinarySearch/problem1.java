package Chapter7_BinarySearch;

import java.util.Scanner;

public class problem1 {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        // 찾은 경우 중간점 인덱스 반환
        if (arr[mid] == target) return mid;
            // 중간점의 값보다 찾고자 하는 값이 작은 경우 왼쪽 확인
        else if (arr[mid] > target)
            return binarySearch(arr, target, start, mid - 1);
            // 중간점의 값보다 찾고자 하는 값이 큰 경우 오른쪽 확인
        else return binarySearch(arr, target, mid + 1, end);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        int M = sc.nextInt();
        for(int i=0; i<M; i++){
            int checkNum = sc.nextInt();
            int search = binarySearch(arr, checkNum, 0, arr.length-1);
            if(search == -1)
                System.out.print("no ");
            else
                System.out.print("yes ");
        }



    }
}
