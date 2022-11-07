package workspace;

import java.util.Scanner;

public class ReverseNumber {
    public int reverse(int x){
        int result = 0;

        // Check x is Positive Int or Negative Int
        boolean posneg = true;
        if(x < 0){
           posneg = false;
           x = -1 * x;
        }

        // Calculate the Tense-5
        int count = 1;
        int temp = x;
        while(temp > 10){
            temp /= 10;
            count *= 10;
        }

        if(count == 1){
            return x;
        }

        // Reverse a given number, This is Armstrong method
        while(x > 0){
            temp = x % 10;
            result = result + (temp * count);
            count /= 10;
            x = x / 10;
        }

        if(posneg) return result;
        else return -1 * result;
    }

    public static void main(String[] args) {
        ReverseNumber obj = new ReverseNumber();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(obj.reverse(num));
    }
}
