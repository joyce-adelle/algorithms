import java.util.*;

public class KthLargestNumberInStream {

    private List<Integer> nums;
    private final int k;
    private PriorityQueue<Integer> heap = new PriorityQueue<>();

    public KthLargestNumberInStream(int[] nums, int k) {

        this.nums = new ArrayList<>();
        for (int num : nums) {
            this.nums.add(num);
            heap.offer(num);
            if (heap.size() > k)
                heap.poll();
        }
        this.k = k;

    }

    public void add(int num) {
        nums.add(num);
        heap.offer(num);
        heap.poll();
    }

    public int getKLargestNumber() {
        return heap.peek();
    }

    public int getK() {
        return k;
    }

    public Integer[] getNums() {
        return nums.toArray(new Integer[0]);
    }

}
