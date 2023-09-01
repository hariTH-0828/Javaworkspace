package workSpace.src.workSpace;

public class GeekonacciNumber {

    public static void main(String[] args) {
        int A = 1; int B = 3; int C = 2;
        int N = 7;

        while(N > 3) {
            int temp = A + B + C;
            A = B; B = C; C = temp;
            N--;
        }
        System.out.println(C);
    }
}
