package workSpace;

class calculator{
	public int add(int x , int y) {
		return x+y;
	}
	
	public int add(int x , int y, int z) {
		return x+y+z;
	}
}

class InheritedCalculator extends calculator{
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return super.add(x, y);
	}
}

public class test {
	public static void printMatrix( int [ ][ ] m ){
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				System.out.println("0 0");
			}
			else {
				for (int j = 0; j < m[i].length; j++)
					System.out.print(m[i][j] + " ");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int[][] b = { { 1, 2 }, null, { 5, 6 } };
		int[][] c = { { 1, 2 }, { 3, 4, 5 }, { 6 } };
		System.out.println("a: ");
		printMatrix(a);
		System.out.println("b: ");
		printMatrix(b);
		System.out.println("c: ");
		printMatrix(c);
	}

}
