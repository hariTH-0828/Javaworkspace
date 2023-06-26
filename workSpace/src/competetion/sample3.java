package competetion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class sample3 {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 2 ints on one line: ");
		try {
				String oneLine = in.readLine();
				if (oneLine == null)
					return;
				Scanner str = new Scanner(oneLine);
				int x = str.nextInt();
				int y = str.nextInt();
				str.close();
				System.out.println("Max: " + Math.max(x, y));
			} catch (IOException e) {
				System.err.println("Unexpected I/O error");
			} catch (NoSuchElementException e) {
				System.err.println("Error: need two ints");
			}
	}
}
