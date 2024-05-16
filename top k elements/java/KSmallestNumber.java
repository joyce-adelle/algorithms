import java.util.*;

public class KSmallestNumber {

    public static void main(String[] args) {

        System.out.println(getKSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 3));
        System.out.println(getKSmallestNumber(new int[] { 1, 5, 12, 2, 11, 5 }, 4));
        System.out.println(getKSmallestNumber(new int[] { 5, 12, 11, -1, 12 }, 3));

    }
    
    public static int getKSmallestNumber(int[] nums, int k) {
        
        if (nums.length < k || k == 0)
            return 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);

        for (int i = 0; i < k; i++) 
            heap.offer(nums[i]);

        for (int i = k; i < nums.length; i++) {
            int n = nums[i];
            if (n < heap.peek()) {
                heap.poll();
                heap.offer(n);
            }
        }

        //In a max heap with the k smallest numbers, the root is the kth smallest number
        return heap.peek();
        
    }
    
}
