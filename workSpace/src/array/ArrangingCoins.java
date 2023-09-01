package workSpace.src.array;

public class ArrangingCoins {

    private int arrange(int target) {
        /*int coins = 0; int i = 0;
        for (; i <= target / 2 && coins <= target; i++) {
            coins += (i + 1);
        }
        if (coins == target) {
            return i;
        } else {
            return i - 1;
        }*/

        int l = 1; int r = target;
        int result = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            double div = (double) mid / 2;
            int coin = (int)((div) * (mid + 1));
            if(coin > target) r = mid - 1;
            else {
                l = mid + 1;
                result = Math.max(mid, result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int target = 5;
        System.out.println(new ArrangingCoins().arrange(target));
    }
}
