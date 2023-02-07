function removeDuplicates(nums: number[]): number [] {

    let result = 1;

    for (let i = 1; i < nums.length; i++) {

        if (nums[result - 1] !== nums[i]) {
            nums[result] = nums[i];
            result++;
        }

    }

    return nums.slice(0, result);

};

console.log(removeDuplicates([1, 1, 2]));
console.log(removeDuplicates([0, 0, 1, 1, 1, 2, 2, 3, 3, 4]));
console.log(removeDuplicates([3, 3]));