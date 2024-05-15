import java.util.*;

public class MedianOfAStream {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static void main(String[] args) {

        MedianOfAStream m = new MedianOfAStream();

        m.add(1);
        m.add(2);
        System.out.println(m.getMedian());
        m.add(3);
        // m.add(6);

        System.out.println(m.getMedian());

    }

    public void add(int num) {

        if (!maxHeap.isEmpty() && num > maxHeap.peek())
            minHeap.offer(num);
        else
            maxHeap.offer(num);

        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.offer(maxHeap.poll());

        else if (minHeap.size() > maxHeap.size())
            maxHeap.offer(minHeap.poll());

    }

    public double getMedian() {

        if (maxHeap.isEmpty())
            return 0;

        return minHeap.size() == maxHeap.size() ? (maxHeap.peek() + minHeap.peek()) / 2.0 : maxHeap.peek();

    }

}
