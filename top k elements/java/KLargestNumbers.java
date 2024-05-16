import java.math.BigInteger;
import java.util.*;

public class KLargestNumbers {

    public static void main(String[] args) {

        System.out.println(getKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 }, 0));
        System.out.println(getKLargestNumbers(new int[] { 5, 12, 11, -1, 12 }, 3));

    }

    public static List<Integer> getKLargestNumbers(int[] nums, int k) {

        if(nums.length < k || k == 0)
            return Collections.emptyList();

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) 
            heap.offer(nums[i]);
        
        for (int i = k; i < nums.length; i++) {
            int num = nums[i];
            if (num > heap.peek()) {
                heap.poll();
                heap.offer(num);
            }
        }

        return heap.stream().toList();
    }

}
