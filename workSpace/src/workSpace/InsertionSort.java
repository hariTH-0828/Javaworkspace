package workSpace;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String args[]) {
		int[] list = { 31, 41, 59, 26, 41, 58 };

		for (int j = 1; j < list.length; j++) {
			int key = list[j];
			int i = j - 1;
			while (i >= 0 && list[i] > key) {
				list[i + 1] = list[i];
				i -= 1;
			}
			list[i + 1] = key;
		}

		System.out.println(Arrays.toString(list));
	}
}
