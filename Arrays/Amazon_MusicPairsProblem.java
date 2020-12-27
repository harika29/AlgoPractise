/**
 * Given an array, count total number of pairs in array whose sum is divisible by an integer K
 */

public class Amazon_MusicPairsProblem {

    public static void main(String[] args) {
        int k = 60;

        int[] array = {10, 50, 90, 30};
        System.out.println(getPairCount(array, k));

        int[] array1 = {30, 20, 150, 100, 40};
        System.out.println(getPairCount(array1, k));

        int[] array2 = {60, 60, 60};
        System.out.println(getPairCount(array2, k));
    }

    public static int getPairCount(int[] arr, int k) {
        int count = 0;
        int[] freq = new int[60];
        for (int i: arr) {
            int rem = i%k;
            count += freq[(k-rem)%k];
            freq[rem]++;
        }
        return count;
    }

}
