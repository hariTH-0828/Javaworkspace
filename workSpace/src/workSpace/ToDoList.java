package workSpace;

import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		while (T-- > 0) {
			int totalProblems = scan.nextInt();
			int[] ratings = new int[totalProblems];
			int count = 0;

			for (int i = 0; i < totalProblems; i++) {
				ratings[i] = scan.nextInt();
				if (ratings[i] >= 1000) {
					count += 1;
				}
			}
			System.out.println(count);
		}
		scan.close();
	}
}
