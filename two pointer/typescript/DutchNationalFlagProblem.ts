/**
 Do not return anything, modify nums in-place instead.
 */
function sortColors(nums: number[]): number[] {

    let left = 0;
    let right = nums.length - 1;
    let i = 0;

    while (i <= right) {
        let num = nums[i];

        if (num === 0) {
            nums[i] = nums[left];
            nums[left] = num;
            i++;
            left++;
        }
        else if (num === 2) {
            nums[i] = nums[right];
            nums[right] = num;
            right--;
        }
        else
            i++;

    }

    return nums;

};

console.log(sortColors([2, 0, 2, 1, 1, 0]));
console.log(sortColors([2, 0, 1]));
console.log(sortColors([0, 0, 2, 1, 1, 2]));
console.log(sortColors([0, 0, 0, 0]));