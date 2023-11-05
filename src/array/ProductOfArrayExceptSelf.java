package array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		for (int i = 0, temp = 1; i < result.length; i++) {
			result[i] = temp;
			temp *= nums[i];
		}
		for (int i = result.length - 1, temp = 1; i >= 0; i--) {
			result[i] = result[i] * temp;
			temp *= nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

}
