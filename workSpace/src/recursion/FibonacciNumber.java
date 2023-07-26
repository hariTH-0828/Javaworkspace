package workSpace.src.recursion;

public class FibonacciNumber {
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return 1 + fib(n-1);
    }

    public static void main(String[] args) {
        int number = fib(3);
        System.out.println(number);
    }
}
