class ListNode {
    value: number;
    next: ListNode | null;

    constructor(val?: number, next?: ListNode | null) {
        this.value = (val ?? 0);
        this.next = (next ?? null);
    }

}

const hasCycle = (head: ListNode | null): boolean => {

    let fast: ListNode | null = head;
    let slow: ListNode | null = head;

    while (fast?.next) {

        slow = slow?.next ?? null;
        fast = fast?.next?.next;

        if (fast?.value === slow?.value)
            return true;
    }

    return false;

}