import java.util.*;

public class Subsets {

    public static void main(String[] args) {

        System.out.println(getSubsets(new int[] { 1, 3 }));
        System.out.println(getSubsets(new int[] { 1, 5, 3 }));
        System.out.println(getSubsets(new int[] {}));

    }

    public static List<List<Integer>> getSubsets(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();

        result.add(Arrays.asList());

        for (int num : arr) {
            int n = result.size();

            for (int i = 0; i < n; i++) {
                List<Integer> prev = result.get(i);
                List<Integer> curr = new ArrayList<>(prev);
                curr.add(num);
                result.add(curr);
            }

        }

        return result;

    }
}
