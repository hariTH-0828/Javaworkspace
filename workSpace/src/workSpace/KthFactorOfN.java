package workSpace.src.workSpace;

import java.util.Arrays;

public class KthFactorOfN {

    public int kthFactor(int n , int k){
        int i = 1; int j = 0;
        int[] factorList = new int[n];

        if(n < k){
            return -1;
        }
        while(i <= n){
            if(n % i == 0){
                factorList[j] = i;
                j++;
            }
            i++;
        }

        if(j < k) return -1;
        else return factorList[k-1];
    }

    public static void main(String[] args) {
        System.out.println(new KthFactorOfN().kthFactor(4, 4));
    }
}
