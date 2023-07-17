package workSpace;

public class ArrayToInteger {

	public int toInt(int[] collection) {
		int number = 0;
		for (int i : collection) {
			number = (number * 10) + i;
		}
		return number;
	}
}
