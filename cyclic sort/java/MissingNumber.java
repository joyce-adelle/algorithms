import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        System.out.println(missingNumber(new int[] { 3, 1, 0 }));
        System.out.println(missingNumber(new int[] { 0, 1 }));
        System.out.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));

    }

    public static int missingNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            int num = arr[i];
            int cIdx = num;

            if (i != cIdx && num < arr.length) {
                int temp = arr[cIdx];
                arr[i] = temp;
                arr[cIdx] = num;
            } else {
                i++;
            }

        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j)
                return j;
        }

        return arr.length;

    }

}
