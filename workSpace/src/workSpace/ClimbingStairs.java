package workSpace;

public class ClimbingStairs {
	
	int climbStairs(int n) {
		int[] possible = new int[n+1];
		int one = 1, two = 1;
		possible[n] = one;
		possible[n - 1] = two;
		for (int i = n - 2; i >= 0; i--) {
			possible[i] = one + two;
			two = one;
			one = possible[i];
		}
		return possible[0];
	}

	int stairsClimbing(int n) {
		int one = 1, two = 1;
		for (int i = 0; i < n - 1; i++) {
			int temp = one;
			one += two;
			two = temp;
		}
		return one;
	}

	public static void main(String args[]) {
		ClimbingStairs climbingStairs = new ClimbingStairs();
		int n = 7;
		int result = climbingStairs.stairsClimbing(n);
		System.out.println(result);
	}

}
