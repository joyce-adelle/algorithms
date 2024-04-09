import java.util.*;

public class SubsetsWithDuplicates {
    
    public static void main(String[] args) {

        System.out.println(getSubsets(new int[] { 1, 3, 3 }));
        System.out.println(getSubsets(new int[] { 1, 5, 3, 3 }));
        System.out.println(getSubsets(new int[] {}));

    }
    
    public static List<List<Integer>> getSubsets(int[] arr) {

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList());

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if(i > 0 && arr[i] == arr[i - 1]) 
                start = end;
                
            end = result.size();

            for (int j = start; j < end; j++) {
                List<Integer> prev = result.get(j);
                List<Integer> curr = new ArrayList<>(prev);
                curr.add(arr[i]);
                result.add(curr);
            }

            start = 0;

        }

        return result;
        
    }
}
