package workSpace;

import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		while (T-- > 0) {
			int N = scan.nextInt();
			int K = scan.nextInt();
			int V = scan.nextInt();
			int[] A = new int[N];
			int sum = 0;

			for (int i = 0; i < N; i++) {
				A[i] = scan.nextInt();
				sum += A[i];
			}

			int average = sum / N;
			int remainder = sum % K;
			if (average == V && remainder == 0) {
				System.out.println(average);
			} else
				System.out.println(-1);
		}
		scan.close();
	}
}
