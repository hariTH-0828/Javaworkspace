package workSpace;

public class MergeSort {

	public void merge(int a[], int beg, int mid, int end) {
		int i, j, k;
		int n1 = mid - beg + 1;
		int n2 = end - mid;

		int LeftArray[] = new int[n1];
		int RightArray[] = new int[n2];

		for (i = 0; i < n1; i++)
			LeftArray[i] = a[beg + i];
		for (j = 0; j < n2; j++)
			RightArray[j] = a[mid + 1 + j];

		i = 0; /* initial index of first sub-array */
		j = 0; /* initial index of second sub-array */
		k = beg; /* initial index of merged sub-array */

		while (i < n1 && j < n2) {
			if (LeftArray[i] <= RightArray[j]) {
				a[k] = LeftArray[i];
				i++;
			} else {
				a[k] = RightArray[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			a[k] = LeftArray[i];
			i++;
			k++;
		}

		while (j < n2) {
			a[k] = RightArray[j];
			j++;
			k++;
		}
	}

	public void mergeSort(int a[], int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(a, beg, mid);
			mergeSort(a, mid + 1, end);
			merge(a, beg, mid, end);
		}
	}

	void printArray(int a[], int n) {
		int i;
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

	public static void main(String args[]) {
		int[] list = { 11, 30, 24, 7, 31, 16, 39, 41 };
		MergeSort mg = new MergeSort();
		mg.mergeSort(list, 0, list.length - 1);
		mg.printArray(list, list.length);
	}
}
