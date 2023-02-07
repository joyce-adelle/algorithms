function twoSumSorted(numbers: number[], target: number): number[] {

    let startPointer = 0;
    let endPointer = numbers.length - 1;

    while (startPointer < endPointer) {

        let sum = numbers[endPointer] + numbers[startPointer];

        if (sum > target)
            endPointer--;

        else if (sum < target)
            startPointer++;

        else
            return [startPointer, endPointer];

    }

    return [];

};

console.log(twoSumSorted([2, 7, 11, 15], 9));
console.log(twoSumSorted([2, 3, 4], 6));
console.log(twoSumSorted([-1, 0], -1));