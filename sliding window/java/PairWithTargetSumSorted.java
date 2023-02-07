import java.util.Arrays;

public class PairWithTargetSumSorted {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[] { 2, 7, 11, 15 }, 9)));
        System.out.println(Arrays.toString(twoSum(new int[] { 2, 3, 4 }, 6)));
        System.out.println(Arrays.toString(twoSum(new int[] { 0, -1 }, -1)));

    }

    public static int[] twoSum(int[] numbers, int target) {

        int startPtx = 0;
        int endPtx = numbers.length - 1;

        while (startPtx < endPtx) {
            int sum = numbers[startPtx] + numbers[endPtx];

            if (sum > target)
                endPtx--;
            else if (sum < target)
                startPtx++;
            else
                return new int[] { startPtx, endPtx};
        }

        return new int[] {};

    }

}
