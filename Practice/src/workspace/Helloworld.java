package workspace;

public class Helloworld {

	public static void main(String[] args) {
		int a = 1, b = 2;
		a = a - b;   // a = 1
		b = a + b;    // b = 3
		a = b - a;

		System.out.println("a : "+a+" b : "+b);

	}
}
