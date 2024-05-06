
public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        System.out.println(search(new int[] { 4, 6, 10 }, 10));
        System.out.println(search(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 5));
        System.out.println(search(new int[] { 10, 6, 4 }, 10));
        System.out.println(search(new int[] { 10, 6, 4 }, 4));
        System.out.println(search(new int[] { 1, 3, 8, 10, 15 }, 12));

    }

    public static int search(int[] nums, int key) {

        int end = nums.length - 1;
        int start = 0;
        boolean asc = false;

        if (nums[0] < nums[1])
            asc = true;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (key == nums[mid])
                return mid;

            if (asc) {
                if (key > nums[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (key > nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            mid = start + (end - start) / 2;

        }

        return -1;

    }

}
