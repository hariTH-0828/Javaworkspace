package workspace;

import java.util.ArrayList;

// Find prime number 0 to N-th position
public class PrimeNumber {

    public static void main(String[] args) {
        // This is prime number array from 3 to 100.
        int[] prime_arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> lst = new ArrayList<>();

        int num = 200;

        for(int i : prime_arr){
            list.add(i);
        }

        // Time complexity --> (n-3)^i times
        for(int i = 3; i < num; i++){
            int j = 2;
            int count = 0;
            while(j < i){
                if(i % j == 0) count += 1;
                j++;
            }
            if (count == 0) {
                lst.add(i);
            }
        }
        System.out.println(lst.size()+" "+list.size());
        System.out.println(lst+"\n"+list);
    }
}
