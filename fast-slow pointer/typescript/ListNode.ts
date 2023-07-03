export default class ListNode {
    value: number;
    next: ListNode | null;

    constructor(val?: number, next?: ListNode | null) {
        this.value = (val ?? 0);
        this.next = (next ?? null);
    }

}