const LongestSubstringKDistinct = (str: string, k: number) => {

    let windowStart = 0;
    let result = Number.MIN_VALUE;
    let characterLength = new Map<String, number>();

    for (let windowEnd = 0; windowEnd < str.length; windowEnd++) {
        characterLength.set(str[windowEnd], characterLength.get(str[windowEnd]) ?? 0 + 1);

        while (characterLength.size > k) {
            let char = str[windowStart];
            let appear = characterLength.get(char) ?? 0;
            appear && appear > 1 ? characterLength.set(char, (appear - 1)) : characterLength.delete(char);

            windowStart++;
        }

        result = Math.max(result, (windowEnd - windowStart + 1));
    }

    return result;

}

console.log(LongestSubstringKDistinct("araaci", 2));
console.log(LongestSubstringKDistinct("araaci", 1));
console.log(LongestSubstringKDistinct("cbbebi", 3));
