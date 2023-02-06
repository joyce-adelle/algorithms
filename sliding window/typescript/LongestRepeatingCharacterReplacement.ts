function characterReplacement(s: string, k: number): number {

    let windowStart = 0;
    let result = 0;
    let characterMap = new Map<string, number>();
    let mostRepeated = 0;

    for (let i = 0; i < s.length; i++) {
        let char = s[i];
        let charNum = (characterMap.get(char) ?? 0) + 1;
        characterMap.set(char, charNum);
        mostRepeated = Math.max(mostRepeated, charNum);

        if ((i - windowStart + 1 - mostRepeated) > k) {
            let charS = s[windowStart];
            let charSNum = (characterMap.get(charS) ?? 1) - 1;
            characterMap.set(charS, charSNum);

            windowStart++;
        }

        result = Math.max(result, i - windowStart + 1);

    }

    return result;

};

console.log(characterReplacement("aabccbb", 2));
console.log(characterReplacement("abbcb", 1));
console.log(characterReplacement("abccde", 1));