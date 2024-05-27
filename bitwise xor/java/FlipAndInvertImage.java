import java.util.*;

public class FlipAndInvertImage {

    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(flipAndInvert(new int[][] {
                { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 }
        })));

    }

    public static int[][] flipAndInvert(int[][] image) {

        for (int [] row: image) {
            int temp;
            int len = row.length;
            for (int j = 0; j < (row.length + 1) / 2; j++) {
                temp = row[j];
                row[j] = row[len - j - 1] ^ 1;
                row[len - j - 1] = temp ^ 1;

            }
        }

        return image;

    }

}
