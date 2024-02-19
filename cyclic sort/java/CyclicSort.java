import java.util.Arrays;

public class CyclicSort {
    
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortOp(new int[] { 1, 5, 6, 4, 3, 2 })));
        System.out.println(Arrays.toString(sortOp(new int[] { 3, 1, 5, 4, 2 })));
        System.out.println(Arrays.toString(sortOp(new int[] { 2, 6, 4, 3, 1, 5 })));

    }
    
    public static int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            while (num != i + 1) {

                int temp = arr[num - 1];
                arr[num - 1] = num;
                arr[i] = temp;

                num = temp;

            }

        }

        return arr;

    }
    
    public static int[] sortOp(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            
            int num = arr[i];
            int correctIdx = num - 1;


            if (arr[correctIdx] != num ) {

                int temp = arr[correctIdx];
                arr[correctIdx] = num;
                arr[i] = temp;

            }
            else
                i++;

        }

        return arr;

    }

}