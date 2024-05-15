import java.util.*;

public class SingleNumbersII {

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[] { 2, 2, 3, 2 }));
        System.out.println(missingNumber(new int[] { 0, 1, 0, 1, 0, 1, 99 }));
        // System.out.println(missingNumber(new int[] { 9, 9, 6, 6, 4, 4, 2, 2, 3, 3, 5,
        // 5, 7, 0, 0, 1, 1 }));

    }

    public static int missingNumber(int[] nums) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;

            for (int num : nums) {
                if ((mask & num) != 0)
                    sum++;
            }

            int n = sum % 2;
            result |= (n << i);

        }

        return result;

    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        if (n > 0 && n < 3)
            return nums[0];
        if (nums[0] != nums[1])
            return nums[0];
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        for (int i = 1; i < n; i += 3) {

            if (nums[i - 1] != nums[i])
                return nums[i - 1];

        }

        return 0;

    }

    public static int singleNumberOp(int[] nums) {

        int result = 0;

        for (int i = 0; i < 32; i++) {
            int sum = 0;

            for (int num : nums)
                sum += ((num >> i) & 1);

            result |= ((sum % 3) << i);
        }

        return result;

    }

}
