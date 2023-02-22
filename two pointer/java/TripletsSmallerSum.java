import java.util.Arrays;

public class TripletsSmallerSum {

    public static void main(String[] args) {

        System.out.println(searchTriplets(new int[] { -1, 4, 2, 1, 3 }, 5));
        System.out.println(searchTriplets(new int[] { -1, 0, 2, 3 }, 3));

    }

    public static int searchTriplets(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            int curr = nums[i];

            if (i > 0 && curr == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int total = curr + nums[left] + nums[right];

                if (total < target) {
                    result += right - left;
                    left++;
                } else
                    right--;
            }
        }

        return result;
    }

}
