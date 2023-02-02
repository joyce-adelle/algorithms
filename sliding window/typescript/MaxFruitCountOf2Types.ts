function totalFruit(fruits: number[]): number {

    let windowStart = 0;
    let result = 0;
    let fruitLengthMap = new Map<number, number>();

    for (let windowEnd = 0; windowEnd < fruits.length; windowEnd++) {
        fruitLengthMap.set(fruits[windowEnd], (fruitLengthMap.get(fruits[windowEnd]) ?? 0) + 1);

        while (fruitLengthMap.size > 2) {
            let fruit = fruitLengthMap.get(fruits[windowStart]) ?? 0;
            fruit > 1 ?
                fruitLengthMap.set(fruits[windowStart], (fruitLengthMap.get(fruits[windowStart]) ?? 0) - 1)
                :
                fruitLengthMap.delete(fruits[windowStart]);

            windowStart++;
        }

        result = Math.max(result, windowEnd - windowStart + 1);
    }

    return result;

};

console.log(totalFruit([1, 2, 3, 2, 2]));
console.log(totalFruit([0, 1, 2, 2]));
console.log(totalFruit([3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4]));