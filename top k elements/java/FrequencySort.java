import java.util.*;

public class FrequencySort {

    public static void main(String[] args) {

        System.out.println(sortCharacterByFrequency("programming"));
        System.out.println(sortCharacterByFrequency("abcbab"));

    }

    public static String sortCharacterByFrequency(String word) {

        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for (char c : word.toCharArray())
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        heap.addAll(frequencyMap.entrySet());

        while (!heap.isEmpty()) {
            var entry = heap.poll();
            for (int i = 0; i < entry.getValue(); i++)
                result.append(entry.getKey());
        }

        return result.toString();

    }

}
