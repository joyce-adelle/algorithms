import java.util.*;

public class ConnectRopes {

    public static void main(String[] args) {

        System.out.println(getCost(new int[] { 1, 3, 11, 5 }));
        System.out.println(getCost(new int[] { 3, 4, 5, 6 }));
        System.out.println(getCost(new int[] { 1, 3, 11, 5, 2 }));

    }
    
    public static int getCost(int[] nums) {
        
        int result = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int num : nums)
            heap.offer(num);

        while (heap.size() > 1) {
            int num1 = heap.poll();
            int num2 = heap.poll();

            int cost = num1 + num2;
            heap.offer(cost);
            result += cost;
        }

        return result;
        
    }
    
}
