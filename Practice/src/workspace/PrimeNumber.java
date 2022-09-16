package workspace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Find prime number 0 to N-th position
public class PrimeNumber {

    private int modVal(int num){
        int mod = num % 10;
        if(num % mod != 0) {
            return mod;
        }
        else {
            return num;
        }
    }

    public static void main(String[] args) {
        // This is prime number array from 3 to 100.
        int[] prime_arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i : prime_arr){
            list.add(i);
        }

        /*Why this method?
            Normal method : we need to find the specific number is prime or not that's not easy to find. This method takes 3 to n-1 times.
            Optimized method : all the numbers or divisible by 2 or 3. Assume that if 9 that is divisible by 3, another one 15 is divisible by 3, nxt 42 is divisible by 2 maximum all the numbers
            are divisible by 2 or 3. some numbers are not divisible by these number but that number is not a prime number. That case we need to mod that number and to find if the mod value is
            divisible by these number then we return as not prime number, else considered as prime number. :) I think this method comes 99% accurate solution.
        */

        /*for(int i = 3; i < 100; i++){
            if(!list.contains(i)){
                int modVal = i % 10;
                if(modVal % 2 != 0 && modVal % 3 != 0) modVal = modVal;
                else {
                    modVal = i;
                }
                if(i % 2 != 0 && i % 3 != 0 && i % modVal != 0){
                    System.out.println(i);
                }
            }
        }*/

        int num = 100;
        PrimeNumber prime = new PrimeNumber();

        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 4; i < 100; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % prime.modVal(i) != 0){
                lst.add(i);
            }
        }

        System.out.println(list.size());
        System.out.println(lst.size()+"\n"+lst);
    }
}
