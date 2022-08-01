public class MaxSumSubArrayOfSizeK {

  public static void main(String[] args) {

    System.out.println(findMaxSumSubArray(3, new int[] { 2, 1, 5, 1, 3, 2 }));
    System.out.println(findMaxSumSubArray(2, new int[] { 2, 3, 4, 1, 5 }));
    
  }

  public static int findMaxSumSubArray(int k, int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;

    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
      currentSum += arr[windowEnd];

      if (windowEnd >= k - 1) {
        maxSum = Math.max(maxSum, currentSum);
        currentSum -= arr[windowEnd - (k - 1)];
      }
    }

    return maxSum;
  }
}