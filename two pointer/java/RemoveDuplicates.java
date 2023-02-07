import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeDuplicates(new int[] { 1, 1, 2 })));
        System.out.println(Arrays.toString(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 })));
        System.out.println(Arrays.toString(removeDuplicates(new int[] { 3, 3 })));
        
    }

    public static int[] removeDuplicates(int[] nums) {

        int result = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[result - 1] != nums[i]) {
                nums[result] = nums[i];
                result++;
            }

        }

        return  Arrays.copyOf(nums, result);

    }

}
