
public class ComplementBase10 {

    public static void main(String[] args) {

        System.out.println(getComplement(8));
        System.out.println(getComplement(10));

    }

    public static int getComplement(int N) {

        if (N == 0)
            return 1;
        int todo = N, bit = 1;
        while (todo != 0) {
            // Flip THE current bit
            N = N ^ bit;
            // Prepare for the next run
            bit = bit << 1;
            todo = todo >> 1;
        }
        return N;

    }

    public static int bitwiseComplement(int n) {

        if (n == 0)
            return 1;

        int num = n;
        int count = 0;
        while (num > 0) {
            count++;
            num = num >> 1;
        }

        int numWithAllBitsSet = (int) Math.pow(2, count) - 1;

        return n ^ numWithAllBitsSet;

    }

}
