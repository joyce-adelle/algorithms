import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeat {

    public static void main(String[] args) {
        
        System.out.println(findLength("aabccbb"));
        System.out.println(findLength("abbbb"));
        System.out.println(findLength("abccde"));
        System.out.println(findLength("OBAMACARE"));

    }

    public static int findLength(String string) {

        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int result = 0;

        for(int windowEnd = 0; windowEnd < string.length(); windowEnd++){

            char c = string.charAt(windowEnd);
            
            Integer pos = map.get(c);
            if(pos != null && pos >= windowStart){
                windowStart = pos + 1;
            }

            map.put(c, windowEnd);

            result = Math.max(result, windowEnd - windowStart + 1);

        }

        return result;

    }
    
}
