public class MinSizeSubArraySum {

    public static void main(String[] args) {

        System.out.println(findMinSubArray(7, new int[] { 2, 1, 5, 2, 3, 2 }));
        System.out.println(findMinSubArray(8, new int[] { 3, 4, 1, 1, 6 }));
        System.out.println(findMinSubArray(8, new int[] { 2, 1, 5, 2, 3, 2 }));
    }

    public static int findMinSubArray(int s, int[] arr) {
        int minLength = Integer.MAX_VALUE;
        int currSum = 0;
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currSum += arr[windowEnd];

            while (currSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                currSum -= arr[windowStart];
                windowStart++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    // Valid algorithm but not optimal
    public static int findMinSubArraySize(int s, int[] arr) {
        int curWinSize = 0;
        int min = Integer.MAX_VALUE;
        int windowSum = 0;

        for (int i = 0; i < arr.length; i++) {
            windowSum += arr[i];
            curWinSize = 1;
            int j = i + 1;
            while (windowSum < s && j < arr.length) {
                windowSum += arr[j];
                curWinSize += 1;
                j = j + 1;
            }
            if (windowSum >= s) {
                min = Math.min(curWinSize, min);
            }
            windowSum = 0;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
