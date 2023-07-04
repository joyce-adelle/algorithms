function isHappy(n: number): boolean {

    let fast = n;
    let slow = n;

    do {
        slow = findSumSquare(slow);
        fast = findSumSquare(findSumSquare(fast));
    } while (fast != slow)

    return slow === 1;

};

const findSumSquare = (num: number): number => {
    let sum = 0;
    while (num > 0) {
        let digit = num % 10;
        sum += digit * digit;
        num = Math.trunc(num / 10);
    }

    return sum;
}