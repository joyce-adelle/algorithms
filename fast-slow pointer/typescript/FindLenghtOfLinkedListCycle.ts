import ListNode from "./ListNode";

const findLength = (head: ListNode): number => {
    let fast: ListNode | null = head;
    let slow: ListNode | null = head;

    while (fast?.next) {
        fast = fast.next.next;
        slow = slow?.next ?? null;
    }
    return slow === null ? 0 : calculateLength(slow);
}

const calculateLength = (node: ListNode): number => {
    let current = node;
    let length = 1;
    while (current.next != null) {
        length++;
        current = current.next;
    }
    return length;
}