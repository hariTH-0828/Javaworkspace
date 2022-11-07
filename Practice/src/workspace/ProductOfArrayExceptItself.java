package workspace;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptItself {
	
	public int[] productExceptSelf(int[] nums) {
		
		int[] inorder = new int[nums.length];
		int[] reverse = new int[nums.length];
		int[] result = new int[nums.length];
		
		// Inorder
		inorder[0] = 1;
 		for(int i = 1; i < nums.length; i++) {
			inorder[i] = inorder[i-1] * nums[i-1];
		}
		System.out.println(Arrays.toString(inorder));
 		
 		// Reverse
 		reverse[nums.length - 1] = 1;
 		for(int j = nums.length - 2; j >= 0; j--) {
 			reverse[j] = reverse[j+1] * nums[j+1];
 		}
		System.out.println(Arrays.toString(reverse));

 		// Result
 		for(int k = 0; k < nums.length; k++) {
 			result[k] = inorder[k] * reverse[k];
 		}
 		
 		return result;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ProductOfArrayExceptItself obj = new ProductOfArrayExceptItself();
		int[] array = {1,2,3,4};
		
		System.out.println(Arrays.toString(obj.productExceptSelf(array)));
		scan.close();

	}
}
