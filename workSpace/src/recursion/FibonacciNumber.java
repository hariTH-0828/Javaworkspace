package workSpace.src.recursion;

public class FibonacciNumber {
    public static int fib(int n){
        if(n == 0 || n == 1){
             return n;
        }
        return fib(n-1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int number = fib(6);
        System.out.println(number);

        System.out.print("Fibonacci series : ");
        int prev = 0; int next = 1;
        int n = 6;
        System.out.print(prev+" "+next);
        while(n > 1){
            int sum = prev + next;
            System.out.print(" "+sum);
            prev = next;
            next = sum;

            n -= 1;
        }
    }
}
