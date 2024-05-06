
public class NextLetter {

    public static void main(String[] args) {

        System.out.println(search(new char[] { 'a', 'c', 'f', 'h' }, 'f'));
        System.out.println(search(new char[] { 'a', 'c', 'f', 'h' }, 'b'));
        System.out.println(search(new char[] { 'a', 'c', 'f', 'h' }, 'm'));
        System.out.println(search(new char[] { 'a', 'c', 'f', 'h' }, 'h'));
        System.out.println(search(new char[] { 'b', 'c', 'f', 'h' }, 'a'));

    }

    public static char search(char[] letters, char key) {

        if (key > letters[letters.length - 1] || key < letters[0])
            return letters[0];

        int start = 0;
        int end = letters.length - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (key == letters[mid])
                return mid + 1 >= letters.length ? letters[0] : letters[mid + 1];

            if (key > letters[mid])
                start = mid + 1;
            else
                end = mid - 1;

            mid = start + (end - start) / 2;

        }

        return letters[start];

    }

}
