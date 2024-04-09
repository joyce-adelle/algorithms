import java.util.*;

public class Permutations {

    public static void main(String[] args) {

        System.out.println(getPermutation(new int[] { 1, 3 }));
        System.out.println(getPermutation(new int[] { 1, 5, 3 }));
        System.out.println(getPermutation(new int[] {}));

    }

    public static List<List<Integer>> getPermutation(int[] arr) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<List<Integer>> permutations = new LinkedList<>();

        permutations.offer(new ArrayList<>());

        for (int num : arr) {

            int n = permutations.size();

            for (int i = 0; i < n; i++) {

                List<Integer> prev = permutations.poll();
                int s = prev.size();

                for (int j = 0; j <= s; j++) {

                    List<Integer> curr = new ArrayList<>(prev);
                    curr.add(j, num);
                    permutations.offer(curr);

                    if (curr.size() == arr.length)
                        result.add(curr);

                }

            }

        }

        return result;
    }

}
