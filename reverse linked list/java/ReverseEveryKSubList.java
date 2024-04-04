
public class ReverseEveryKSubList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = reverseKSubList(head, 3);
        System.out.print("Nodes of the reversed list are: ");

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    public static ListNode reverseKSubList(ListNode head, int k) {

        ListNode curr = head;
        ListNode headR = head;
        
        for (int i = 1; curr != null && curr.next != null; i = i + k) {
            if (i == 1) {
                headR = reverseSub(curr, i, i+k-1);
            }
            else curr = reverseSub(headR, i, i+k-1);
            
        }

        return headR;

    }

    public static ListNode reverseSub(ListNode head, int p, int q) {

        System.out.print(p);
        System.out.print(q);

        System.out.println();

        if (p == q)
            return head;

        ListNode curr = head;
        ListNode prev = null;

        for (int i = 1; i < p && curr != null; i++) {
            prev = curr;
            curr = curr.next;
        }

        ListNode rCurr = curr;
        ListNode rPrev = null;
        int i = 0;

        while (rCurr != null && i <= q - p) {

            ListNode temp = rCurr.next;
            rCurr.next = rPrev;
            rPrev = rCurr;
            rCurr = temp;
            i++;

        }

        if (prev != null)
            prev.next = rPrev;
        else
            head = rPrev;

        if (curr != null)
            curr.next = rCurr;

        if (p == 1)
            return head;
        return rCurr;

    }

}

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
