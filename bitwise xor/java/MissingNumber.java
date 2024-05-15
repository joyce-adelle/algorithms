
public class MissingNumber {

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[] { 3, 0, 1}));
        System.out.println(missingNumber(new int[] { 0, 1}));
        System.out.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1}));

    }
    
    public static int missingNumber(int[] nums) {

        int x = 0;
        for (int i = 1; i <= nums.length; i++)
            x ^= i;

        int y = nums[0];
        for (int i = 1; i < nums.length; i++)
            y ^= nums[i];

        return x ^ y;

    }
    
}
