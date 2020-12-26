import java.util.*;
class TwoNumberSum_SortProgram {
    public static void main(String[] args) {
        int array[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int result[] = twoNumberSum(array, targetSum);
        if (result.length > 0) 
            System.out.println(result[0]+","+result[1]);
        else
            System.out.println("No 2 numbers sum up to target");
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
		Arrays.sort(array);
		int start = 0, end = array.length - 1;
		while (start < end) {
			int currentSum = array[start] + array[end];
			if (currentSum == targetSum) {
				return new int[]{array[start], array[end]};
			} else if (currentSum > targetSum) {
				end--;
			} else {
				start++;
			}
		}
		return new int[0];
	}
}