import java.util.*;
class Program1 {
    public static void main(String args[]) {
        int array[] = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int targetSum = 163;
        int result[] = twoNumberSum(array, targetSum);
        if (result.length > 0) 
            System.out.println(result[0]+","+result[1]);
        else
            System.out.println("No 2 numbers sum up to target");
    }
    
    public static int[] twoNumberSum(int[] array, int targetSum) { 
		Set<Integer> hs = new HashSet<>();
		for(int value: array) {
			int diff = targetSum - value;
			if(hs.contains(diff) && diff != value) {
					return new int[]{diff, value};
			} else {
				hs.add(value);
			}
		}
		return new int[0];
	}
}