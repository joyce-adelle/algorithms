import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        
        System.out.println(findLength("aabccbb", 2));
        System.out.println(findLength("abbcb", 1));
        System.out.println(findLength("abccde", 1));
        
    }

    public static int findLength(String string, int k) {

        int result = 0;
        int windowStart = 0;
        HashMap<Character, Integer> characterLength = new HashMap<>();
        int maxRepeatingCharacter = 0;

        for(int windowEnd = 0; windowEnd < string.length(); windowEnd++){

            char c = string.charAt(windowEnd);
            characterLength.put(c, characterLength.getOrDefault(c, 0) + 1);
            maxRepeatingCharacter = Math.max(maxRepeatingCharacter, characterLength.get(c));
            System.out.println(maxRepeatingCharacter);

            if(( windowEnd - windowStart + 1 - maxRepeatingCharacter) > k ) {
                char f = string.charAt(windowStart);
                characterLength.put(f, characterLength.get(f) - 1);

                windowStart++;

            }

            result = Math.max(result, windowEnd - windowStart + 1);
        }

        return result;
        
    }
}