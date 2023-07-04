
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {

        ListNode tor = head;
        ListNode hare = head;

        while (hare != null && hare.next != null) {
            tor = tor.next;
            hare = hare.next.next;
        }

        return tor;

    }
}

// Definition for singly-linked list.
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