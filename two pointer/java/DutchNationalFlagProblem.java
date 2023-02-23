import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[] { 2, 0, 2, 1, 1, 0 })));
        System.out.println(Arrays.toString(sortColors(new int[] { 2, 0, 1 })));
        System.out.println(Arrays.toString(sortColors(new int[] { 0, 0, 2, 1, 1, 2 })));
        System.out.println(Arrays.toString(sortColors(new int[] { 0, 0, 0, 0 })));
    }

    public static int[] sortColors(int[] nums) {

        int i = 0;
        int left = 0;
        int right = nums.length - 1;

        while (i <= right) {
            int num = nums[i];

            if (num == 0) {
                nums[i] = nums[left];
                nums[left] = num;
                left++;
                i++;
            } else if (num == 2) {
                nums[i] = nums[right];
                nums[right] = num;
                right--;
            } else
                i++;
        }

        return nums;

    }
}
