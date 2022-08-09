public class LongestSubarrayWithOnesAfterReplacement {

    public static void main(String[] args) {

        System.out.println(getLength(new int [] {0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1} , 2));
        System.out.println(getLength(new int [] {0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1} , 3));
        
    }

    public static int getLength(int [] array, int k) {

        int result = 0;
        int maxOnesInWindow = 0;
        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < array.length; windowEnd++){

            if (array[windowEnd] == 1)
                maxOnesInWindow++;

            if((windowEnd - windowStart + 1) - maxOnesInWindow > k ){

                if(array[windowStart] == 1)
                    maxOnesInWindow--;
                windowStart++;

            }

            result = Math.max(result, windowEnd - windowStart + 1);

        }

        return result;
        
    }
    
}
