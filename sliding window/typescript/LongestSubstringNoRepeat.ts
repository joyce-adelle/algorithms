function lengthOfLongestSubstring(s: string): number {

    let result = 0;
    let currentString = "";

    for (let windowEnd = 0; windowEnd < s.length; windowEnd++) {
        let endStr = s[windowEnd];

        if (currentString.includes(endStr))
            currentString = currentString.substring(currentString.indexOf(endStr) + 1);

        currentString += endStr;
        result = Math.max(result, currentString.length);
    }


    return result;

};

function lengthOfLongestSubstringOptimal(s: string): number {

    let windowStart = 0;
    let result = 0;
    let map = new Map<String, number>();

    for (let windowEnd = 0; windowEnd < s.length; windowEnd++) {
        let str = s[windowEnd];

        let index = map.get(str);
        if (index !== undefined && index >= windowStart)
            windowStart = index + 1;

        map.set(str, windowEnd);
        result = Math.max(result, (windowEnd - windowStart + 1));
    }

    return result;

};

console.log(lengthOfLongestSubstringOptimal("abcabcbb"));
console.log(lengthOfLongestSubstringOptimal("pwwkew"));
console.log(lengthOfLongestSubstringOptimal(" "));