import java.util.Arrays;
import java.util.HashMap;

public class PairWithTargetSumUnsorted {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 2, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 3, 3 }, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> numIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer secondIdx = numIdx.get(target - num);

            if (secondIdx == null)
                numIdx.put(num, i);

            else
                return new int[] { i, secondIdx };
        }

        return new int[] {};

    }

}
