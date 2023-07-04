import { findLength } from "./FindLengthOfLinkedListCycle";
import ListNode from "./ListNode";

const getStartOfCycle = (head: ListNode | null): ListNode | null => {
    let fast = head;
    let slow = head;
    let start = null;

    if (head != null) {
        const length = findLength(head);
        if (length > 0) {
            slow = slow?.next ?? null;
            for (let i = 0; i < length; i++) {
                fast = fast?.next ?? null;
            }
            while (fast !== slow) {
                slow = slow?.next ?? null;
                fast = fast?.next ?? null;
            }
            return fast;
        }
    }

    return start;

}