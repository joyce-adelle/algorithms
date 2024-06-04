import java.util.*;

public class TopKFrequentNumbers {

    public static void main(String[] args) {

        System.out.println(getTopKFrequentNumbers(new int[] { 1, 3, 5, 12, 11, 12, 11 }, 2));
        System.out.println(getTopKFrequentNumbers(new int[] { 5, 12, 11, 3, 11 }, 2));

    }

    public static List<Integer> getTopKFrequentNumbers(int[] numbers, int k) {

        List<Integer> result = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers)
            map.put(num, map.getOrDefault(num, 0) + 1);

        maxHeap.addAll(map.entrySet());

        for (int i = 0; i < k; i++)
            result.add(maxHeap.poll().getKey());

        return result;

    }

}
