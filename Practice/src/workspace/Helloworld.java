package workspace;

import java.util.ArrayList;

public class Helloworld {

	public static void main(String args[]) {
		int num = 43;
		int mod = num % 10;
		System.out.println(mod % 2 +" "+mod % 3+" "+num % mod);
		if(mod % 2 != 0 && mod % 3 != 0 && num % mod != 0) {
			System.out.println(true);
		}
		else {
			System.out.println(num);
		}
	}
}
