import ListNode from "./ListNode";

function middleNode(head: ListNode | null): ListNode | null {
    let fast = head;
    let slow = head;

    while (fast?.next) {
        slow = slow?.next ?? null;
        fast = fast?.next?.next;
    }

    return slow;

};