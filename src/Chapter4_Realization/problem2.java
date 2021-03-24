package Chapter4_Realization;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
        int hour = 0, minute=0, second=0;
        while(hour != N || minute != 59 || second != 59){
            second+=1;
            if(second == 60){
                second = 0;
                minute+=1;
            }
            if(minute == 60){
                minute = 0;
                hour +=1;
            }
            String time = hour+":"+minute+":"+second;
            if(time.contains("3"))
                result+=1;
        }
        System.out.println(result);
    }
}
