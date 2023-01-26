function minSubArrayLen(target: number, nums: number[]): number {

    let result = Number.POSITIVE_INFINITY;
    let windowStart = 0;
    let windowSum = 0;

    for (let windowEnd = 0; windowEnd <= nums.length; windowEnd++) {
        windowSum += nums[windowEnd];

        while (windowSum >= target) {
            result = Math.min(result, (windowEnd - windowStart + 1));
            windowSum -= nums[windowStart];
            windowStart++;
        }
    }

    return result === Number.POSITIVE_INFINITY ? 0 : result;

};