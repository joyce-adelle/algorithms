import java.util.HashMap;

public class MaxFruitCountOf2Types {

    public static void main(String[] args) {
        
        System.out.println(findLength(new char [] {'A', 'B', 'C', 'A', 'C'}));
        System.out.println(findLength(new char [] {'A', 'B', 'C', 'B', 'B', 'C'}));

    }

    public static int findLength(char[] arr) {
        
        HashMap<Character, Integer> map = new HashMap<>();

        int windowStart = 0;
        int result = Integer.MIN_VALUE;
        int windowLength = 0;

        for(int windowEnd = 0; windowEnd < arr.length; windowEnd++){
            char c = arr[windowEnd];
            map.put(c, map.getOrDefault(c, 0) + 1);
            windowLength++;

            while(map.size() > 2){
                char k = arr[windowStart];
                map.put(k, map.getOrDefault(k, 0) - 1);

                if(map.get(k) <= 0)
                    map.remove(k);

                windowStart++;    
                windowLength--;
            }

            result = Math.max(result, windowLength);
        
        }


        return result;
    }
    
}


