import java.util.Arrays;

public class TwoSingleNumbers {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(singleNumber(new int[] { 1, 2, 1, 3, 2, 5 })));
        System.out.println(Arrays.toString(singleNumber(new int[] { -1, 0 })));
        System.out.println(Arrays.toString(singleNumber(new int[] { 0, 1 })));

    }

    public static int[] singleNumber(int[] nums) {

        int xor2 = 0;
        for (int num : nums)
            xor2 ^= num;

        int rightMostBit = Integer.lowestOneBit(xor2);

        // can also get by bitwise and (&) with xor2
        // int rightMostBit = 1;
        // while((rightMostBit & xor2) == 0)
        // rightMostBit = rightMostBit << 1;

        int[] result = new int[] { 0, 0 };

        for (int num : nums) {
            if ((rightMostBit & num) == 0)
                result[0] ^= num;
            else
                result[1] ^= num;
        }

        return result;

    }

}
