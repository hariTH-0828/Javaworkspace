package workSpace;

import java.util.Scanner;

public class PracticeMakeUsPerfect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] practices = new int[4];
		int followed = 0;

		for (int i = 0; i < 4; i++) {
			practices[i] = scan.nextInt();
			if (practices[i] >= 10) {
				followed += 1;
			}
		}

		System.out.println(followed);
		scan.close();
	}
}
