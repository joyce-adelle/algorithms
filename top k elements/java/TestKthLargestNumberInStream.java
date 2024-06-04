public class TestKthLargestNumberInStream {

    public static void main(String[] args) {

        KthLargestNumberInStream kth = new KthLargestNumberInStream(new int[] { 3, 1, 5, 12, 2, 11 }, 4);
        System.out.println(kth.getKLargestNumber());
        kth.add(6);
        System.out.println(kth.getKLargestNumber());
        kth.add(13);
        System.out.println(kth.getKLargestNumber());
        kth.add(4);
        System.out.println(kth.getKLargestNumber());

    }

}
