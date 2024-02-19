public class FindDuplicateNumber {

    public static void main(String[] args) {

        System.out.println(duplicateNumber(new int[] { 1, 4, 4, 3, 2 }));
        System.out.println(duplicateNumber(new int[] { 2, 1, 3, 3, 5, 4 }));
        System.out.println(duplicateNumber(new int[] { 2, 4, 1, 4, 4 }));

    }

    public static int duplicateNumber(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            int num = arr[i];
            int cIdx = num;

            if (i != cIdx) {
                int temp = arr[cIdx];

                if (temp == num)
                    return num;

                arr[i] = temp;
                arr[cIdx] = num;

            } else
                i++;

        }

        return 0;

    }

}
