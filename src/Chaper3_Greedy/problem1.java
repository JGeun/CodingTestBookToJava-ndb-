package Chaper3_Greedy;

public class problem1 {
    public static void main(String[] args) {
        int money = 1260;
        int[] coinType = {500, 100, 50, 10};
        int cnt = 0;

        for(int i=0; i<4; i++){
            int coin = coinType[i];
            cnt += money / coin;
            money %= coin;
        }
        System.out.println(cnt);
    }
}
