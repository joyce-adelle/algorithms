
public class ReverseLinkedList {

    public static void main(String[] args) {

        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(8);
        head.next.next.next.next = new ListNode(10);

        ListNode result = reverse(head);
        System.out.print("Nodes of the reversed list are: ");

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    public static ListNode reverse(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {

            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        
        return prev;

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
