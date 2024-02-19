import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumbers {
    
    public static void main(String[] args) {

        System.out.println(allMissingNumbers(new int[] { 2, 3, 1, 8, 2, 3, 5, 1}));
        System.out.println(allMissingNumbers(new int[] { 2, 4, 1, 2 }));
        System.out.println(allMissingNumbers(new int[] { 2, 3, 2, 1 }));

    }

    public static List<Integer> allMissingNumbers(int[] arr) {

        List<Integer> result = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {

            int num = arr[i];
            int cIdx = num - 1;

            if (arr[i] != arr[cIdx]) {
                int temp = arr[cIdx];
                arr[i] = temp;
                arr[cIdx] = num;
            } else {
                i++;
            }

        }

        for (int j = 1; j <= arr.length; j++) {
            if (arr[j-1] != j)
                result.add(j);
        }

        return result;

    }

}
