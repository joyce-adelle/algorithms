import ListNode from "./ListNode";

function detectCycle(head: ListNode | null): ListNode | null {

    let fast = head;
    let slow = head;

    while (fast?.next) {
        fast = fast.next.next;
        slow = slow?.next ?? null;

        if (fast === slow) {
            slow = head;
            while (fast !== slow) {
                slow = slow?.next ?? null;
                fast = fast?.next ?? null;
            }
            return fast;
        }
    }

    return null;

};