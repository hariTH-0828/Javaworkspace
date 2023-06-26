package exceptionhandling;

import java.io.IOException;

public class BasicExceptionHandling {

	public void typeOne() {
		int arr[] = new int[5];
		try {
			for (int i = 0; i < 6; i++)
				arr[i] = i + 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		}
		System.out.println("Exception handling work");
	}

	public void typeOneWithout() {
		int arr[] = new int[5];
		for (int i = 0; i < 6; i++)
			arr[i] = i + 1;
		System.out.println("Exception handling work");
	}

	public void typeTwo() {
		int arr[] = new int[5];
		BasicExceptionHandling b = null;
		try {
			for (int i = 0; i < 5; i++)
				arr[i] = i + 1;
			b.typeOne();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Exception handling work");
	}

	public void typeThree() {
		int arr[] = new int[5];
		BasicExceptionHandling b = null;
		try {
			for (int i = 0; i < 5; i++)
				arr[i] = i + 1;
			b.typeOne();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("i am finally");
		}
		System.out.println("Exception handling work");
	}

	public void typeFour() {
		int arr[] = new int[5];
		BasicExceptionHandling b = null;
		try {
			for (int i = 0; i < 5; i++)
				arr[i] = i + 1;
			b.typeOne();
		} /*
			 * catch (ArrayIndexOutOfBoundsException e) { System.err.println(e); } /*catch
			 * (Exception e) { System.out.println(e); }
			 */finally {
			System.out.println("i am finally");
		}
		System.out.println("Exception handling work");
	}

	public void getInput(String s) {
		if (s == null) {
			throw new NullPointerException();
		}
		System.out.println("not null");
	}

	public void mayThrowException(String s, int arr[], int accessIndex)
			throws IOException {
		if (s == null)
			throw new IOException("input not given");
		if (arr.length <= accessIndex)
			throw new ArrayIndexOutOfBoundsException();
	}

	public void mayThrowExceptionRuntime(String s, int arr[], int accessIndex)
			throws NullPointerException, ArrayIndexOutOfBoundsException {
		if (s == null)
			throw new NullPointerException();
		if (arr.length <= accessIndex)
			throw new ArrayIndexOutOfBoundsException();
	}
}
