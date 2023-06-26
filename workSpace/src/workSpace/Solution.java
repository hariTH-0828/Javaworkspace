package workSpace;

import java.util.Scanner;

public class Solution {

	public int getPairCount(int[] arr, int n) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find the pair in array: ");
		int K = scanner.nextInt();
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (K == arr[i] + arr[j]) {
					count += 1;
				}
			}
		}
		scanner.close();
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Solution sol = new Solution();
		System.out.println("Enter the number of Array Element:");
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(sol.getPairCount(arr, n));
		scan.close();

	}

}
