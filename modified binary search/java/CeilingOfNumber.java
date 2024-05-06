
public class CeilingOfNumber {

    public static void main(String[] args) {

        System.out.println(getCeil(new int[] { 4, 6, 10 }, 6));
        System.out.println(getCeil(new int[] { 1, 3, 8, 10, 15 }, 12));
        System.out.println(getCeil(new int[] { 4, 6, 10 }, 17));
        System.out.println(getCeil(new int[] { 4, 6, 10 }, -1));

    }

    public static int getCeil(int[] nums, int key) {

        if (key > nums[nums.length - 1])
            return -1;

        int start = 0;
        int end = nums.length - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (nums[mid] == key)
                return mid;

            if (nums[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;

            mid = start + (end - start) / 2;

        }

        return start;

    }

}