package Chapter4_Realization;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X=1, Y=1;
        int N = sc.nextInt();
        sc.nextLine();
        String[] plans = sc.nextLine().split(" ");

        for(int i=0; i<plans.length; i++){
            switch (plans[i].charAt(0)){
                case 'L':
                    if(X>1)
                        X-=1;
                    break;
                case 'R':
                    if(X<N)
                        X+=1;
                    break;
                case 'U':
                    if(Y>1)
                        Y-=1;
                    break;
                case 'D':
                    if(Y<N)
                        Y+=1;
                    break;
            }
        }
        System.out.println(Y + " " + X);
    }
}
