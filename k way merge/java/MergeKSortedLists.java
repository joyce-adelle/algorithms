import java.util.*;

/**
 * ListNode
 */
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeKSortedLists {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2, new ListNode(6, new ListNode(8)));
        ListNode l2 = new ListNode(3, new ListNode(6, new ListNode(7)));
        ListNode l3 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode res = mergeListNodes(new ListNode[] { l1, l2, l3 });
        
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }

        System.out.println();

    }
    
    public static ListNode mergeListNodes(ListNode[] lists) {

        ListNode result;

        PriorityQueue<ListNode> heap = new PriorityQueue<>((a,b) -> a.val - b.val);
        heap.addAll(Arrays.asList(lists));
        result = heap.peek();

        while (!heap.isEmpty()) {

            ListNode curr = heap.poll();
            ListNode temp = curr.next;

            if(temp != null)
                heap.offer(temp);

            curr.next = heap.peek();
            
        }

        return result;
        
    }
    
}
