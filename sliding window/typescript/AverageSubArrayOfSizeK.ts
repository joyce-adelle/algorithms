//function to find the average of numbers in all sub-arrays of size k
const AverageSubArrayOfSizeK = (k: number, array: number[]) : number[] => {
    let windowStart = 0;
    let windowSum = 0;
    let result: number[] = [];

    for (let windowEnd = 0; windowEnd < array.length; windowEnd++) {
        windowSum += array[windowEnd];

        if (windowEnd >= k - 1) {
            result.push(windowSum / k);
            windowSum -= array[windowStart];
            windowStart++;
        }
    }

    return result;

};

console.log(AverageSubArrayOfSizeK(5, [1, 3, 2, 6, -1, 4, 1, 8, 2]));
