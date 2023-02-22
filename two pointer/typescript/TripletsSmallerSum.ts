function searchTriplets(nums: number[], target: number) {

    nums.sort((a, b) => a - b);
    console.log(nums);

    let result = 0;
    for (let i = 0; i < nums.length - 2; i++) {

        let curr = nums[i];

        if (i > 0 && curr === nums[i - 1])
            continue;

        let left = i + 1;
        let right = nums.length - 1;

        while (left < right) {
            let total = curr + nums[left] + nums[right];
            if (total < target) {
                result+= right - left;
                left++;
            }
            else {
                right--;
            }

        }
    }

    return result;

}

console.log(searchTriplets([-1, 4, 2, 1, 3], 5));
console.log(searchTriplets([-1, 0, 2, 3], 3));