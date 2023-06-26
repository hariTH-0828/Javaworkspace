package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class CoinCounts {
	static int c[];
	static long cnt;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int at = sc.nextInt();
		int n = sc.nextInt();
		c = new int[n];
		cnt = 0;
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		Arrays.sort(c);
		CoinCounts s = new CoinCounts();
		s.chk(at, 0);
		System.out.println(cnt);
		sc.close();
	}

	void chk(int amount, int i) {
		if (amount == 0) {
			cnt++;
			return;
		}
		for (int j = i; j < c.length; j++) {
			if (amount >= c[j]) {
				chk(amount - c[j], j);
			} else {
				return;
			}
		}
		return;
	}

}
