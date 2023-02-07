function longestOnes(nums: number[], k: number): number {

    let windowStart = 0;
    let result = 0;
    let max1s = 0;

    for (let windowEnd = 0; windowEnd < nums.length; windowEnd++) {
        if (nums[windowEnd] === 1)
            max1s++;

        if ((windowEnd - windowStart + 1 - max1s) > k) {
            if (nums[windowStart] === 1)
                max1s--;

            windowStart++;
        }

        result = Math.max(result, (windowEnd - windowStart + 1));

    }

    return result;

};

console.log(longestOnes([0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], 2));
console.log(longestOnes([0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1], 3));