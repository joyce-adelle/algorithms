function findMaxAverage(nums: number[], k: number): number {

    let windowStart = 0;
    let windowSum = 0;
    let result = Number.NEGATIVE_INFINITY;

    for (let windowEnd = 0; windowEnd < nums.length; windowEnd++) {
        windowSum += nums[windowEnd];

        if (windowEnd >= k - 1) {
            result = Math.max(result, windowSum / k);
            windowSum -= nums[windowStart];
            windowStart++;
        }
    }

    return result;

};

function findMaxAverageFaster(nums: number[], k: number): number {
    let maxAvg = Number.NEGATIVE_INFINITY;
    let totalSum = 0;
    for (let i = 0; i < k; i++) {
        totalSum += nums[i];
        maxAvg = totalSum / k;
    }
    for (let i = k; i < nums.length; i++) {
        totalSum += nums[i] - nums[i - k];
        maxAvg = Math.max(totalSum / k, maxAvg);
    }

    return maxAvg;
};

console.log(findMaxAverage([1, 3, 2, 6, -1, 4, 1, 8, 2], 5));