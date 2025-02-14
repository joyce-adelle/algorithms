import java.util.HashMap;

public class PermutationInAString {

    public static void main(String[] args) {

    }
    
    public static boolean permutationInAString(String str, String pattern) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : pattern.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                // map.get()
            }
        }
        
        return false;
        
    }
    
}
