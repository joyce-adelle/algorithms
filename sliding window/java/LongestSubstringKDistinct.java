import java.util.HashMap;

public class LongestSubstringKDistinct {

    public static void main(String[] args) {
        
        System.out.println(findLength("araaci", 2));
        System.out.println(findLength("araaci", 1));
        System.out.println(findLength("cbbebi", 3));

    }
    
    public static int findLength(String str, int k) {

        HashMap<Character, Integer> characterLength = new HashMap<>();
        int windowStart = 0;
        int result = Integer.MIN_VALUE;
        int windowLength = 0;
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
          char c = str.charAt(windowEnd);
          windowLength++;
          characterLength.put(c, characterLength.getOrDefault(c, 0) + 1);
    
          while(characterLength.size() > k){
            char ch = str.charAt(windowStart);
            int n = characterLength.get(ch);

            if (n > 1)
              characterLength.put(ch, n - 1);
            else
              characterLength.remove(ch);
    
            windowStart++;
            windowLength--;
    
          }
          result = Math.max(result, windowLength);
        }
    
        return result;
      }

}
