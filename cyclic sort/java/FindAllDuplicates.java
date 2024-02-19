import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {

        System.out.println(allDuplicates(new int[] { 3, 4, 4, 5, 5 }));
        System.out.println(allDuplicates(new int[] { 5, 4, 7, 2, 3, 5, 3 }));
        System.out.println(allDuplicates(new int[] { 2, 3, 2, 1 }));

    }

    public static List<Integer> allDuplicates(int[] arr) {

        List<Integer> result = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {

            int num = arr[i];
            int cIdx = num - 1;

            if (cIdx < 0)
                i++;

            else if (i != cIdx) {
                int temp = arr[cIdx];

                if (temp == num) {
                    arr[i] = 0;
                    result.add(num);
                    i++;
                } else {
                    arr[i] = temp;
                    arr[cIdx] = num;
                }

            } else
                i++;

        }

        return result;

    }

    public List<Integer> findDuplicates(int[] arr) {

        List<Integer> result = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {

            int num = arr[i];
            int cIdx = num - 1;

            if (arr[i] != arr[cIdx]) {
                int temp = arr[cIdx];
                arr[i] = temp;
                arr[cIdx] = num;

            } else
                i++;

        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1)
                result.add(arr[j]);
        }

        return result;

    }

}
