import java.util.*;

public class IsUnique {

    public static void main(String[] args) {

        System.out.println(check("isUnique"));
        System.out.println(check("yes"));

    }
    
    public static boolean check(String word) {
        
        String[] letters = word.toLowerCase().split("");
        // String sorted = word.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
        //         .toString();
        
        Arrays.sort(letters);

        for (int i = 1; i < letters.length; i++) {
            if (letters[i].equalsIgnoreCase(letters[i - 1]))
                return false;
        }
        
        return true;

    }
    
}
