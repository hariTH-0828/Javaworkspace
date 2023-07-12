package workSpace;

public class CheckPrimeNumber {

	boolean isPrime(int num) {
		int i = 2;

		if (num == 0 || num == 1) {
			return false;
		}

		if (num == i) {
			return true;
		}

		while (i <= Math.sqrt(num)) {
			if (num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String args[]) {
		CheckPrimeNumber primeNumber = new CheckPrimeNumber();

		for (int i = 2; i <= 100; i++) {
			boolean isPrime = primeNumber.isPrime(i);

			if (isPrime) {
				System.out.print(i + " ");
			}
		}

	}
}
