import java.util.*;
public class FindOddCountElement {

    public static void main(String[] args) {
        int arr[] = new int[]{1,4,6,4,1};
        System.out.println("Element occuring odd num of times is: " + findOddCount(arr));
    }

    static int findOddCount(int[] arr) {
        List<Integer> oddList = new ArrayList<>();
        for(int element: arr) {
            if (oddList.contains(element)) {
                oddList.remove(Integer.valueOf(element));
            } else {
                oddList.add(element);
            }
        }
        return oddList.get(0);
    }
    
}
