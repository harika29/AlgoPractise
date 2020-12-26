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
		int start = 0;
		int end = array.length - 1;
		while(start<end) {
			if(array[start]+array[end] == targetSum) {
				return new int[] {array[start], array[end]};
			} else if (array[start]+array[end] < targetSum) {
				start = start + 1;
			} else {
				end = end - 1;
			}
		}
		return new int[0];
	}
}