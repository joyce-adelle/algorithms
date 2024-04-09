import java.util.*;

public class LetterCaseStringPermutation {
    
    public static void main(String[] args) {

        System.out.println(getPermutations("add52"));

    }
    
    public static List<String> getPermutations(String str) {

        List<String> result = new ArrayList<>();
        result.add(str);

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                int n = result.size();

                for (int j = 0; j < n; j++) {
                    StringBuilder s = new StringBuilder(result.get(j));
                    if(Character.isLowerCase(ch))
                        s.setCharAt(i, Character.toUpperCase(ch));
                    else
                        s.setCharAt(i, Character.toLowerCase(ch));

                    result.add(s.toString());
                }
            }
        }

        return result;
        
    }

}
