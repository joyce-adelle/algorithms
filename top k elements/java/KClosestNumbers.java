import java.util.*;

public class KClosestNumbers {

    public static void main(String[] args) {

        System.out.println(getKClosestNumbers(new int[] { 5, 6, 7, 8, 9 }, 3, 7));
        System.out.println(getKClosestNumbers(new int[] { 2, 4, 5, 6, 9 }, 3, 6));
        System.out.println(getKClosestNumbers(new int[] { 2, 4, 5, 6, 9 }, 3, 10));

    }
    
    public static List<Integer> getKClosestNumbers(int[] nums, int k, int x) {
        
        List<Integer> result = new ArrayList<>();

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> Math.abs(a - x) - Math.abs(b - x));

        for (int num : nums)
            heap.offer(num);

        for (int i = 0; i < k; i++)
            result.add(heap.poll());

        result.sort((a, b) -> a - b);

        return result;
        
    }
    
}
