import java.util.*;

public class MaximumDistinctElements {

    public static void main(String[] args) {

        System.out.println(getMaxDistinctElements(new int[] { 7, 3, 5, 8, 5, 3, 3 }, 2));
        System.out.println(getMaxDistinctElements(new int[] { 3, 5, 12, 11, 12 }, 3));
        System.out.println(getMaxDistinctElements(new int[] { 1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5 }, 2));

    }

    public static int getMaxDistinctElements(int[] nums, int k) {

        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (var entry : map.entrySet()) {
            if (entry.getValue() > 1)
                heap.offer(entry);
            else
                result++;
        }

        int times = 0;
        while (!heap.isEmpty() && times < k) {

            var entry = heap.poll();
            int value = entry.getValue();
            while (times < k && value > 1) {
                times++;
                value--;
            }
            if (value == 1)
                result++;
            //map.put(entry.getKey(), value);

        }

        if (times < k)
            result -= k - times;

        // for (var entry : map.entrySet()) {
        //     if (times < k)
        //         times++;
        //     else if (entry.getValue() == 1)
        //         result++;
        // }

        return result;

    }

}
