function twoSum(nums: number[], target: number): number[] {

    let numIdx = new Map<number, number>();

    for (let i = 0; i < nums.length; i++) {

        let num = nums[i];
        let secIdx = numIdx.get(target - num);

        if (secIdx === undefined)
            numIdx.set(num, i);

        else
            return [i, secIdx];

    }

    return [];

};

console.log(twoSum([2, 7, 11, 15], 9));
console.log(twoSum([3, 2, 4], 6));
console.log(twoSum([3, 3], 6));