import java.util.*;
import java.util.stream.*;

public class MinimumMeetingRooms {

    /**
     * Intervals
     */
    public static class Meeting {
        int start = 0;
        int end = 0;

        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void printInterval() {
            System.out.print("[ " + start + ", " + end + " ]");
        }

    }

    public static void main(String[] args) {

        List<Meeting> intervals = new ArrayList<>();

        intervals.add(new Meeting(1, 4));
        intervals.add(new Meeting(2, 5));
        intervals.add(new Meeting(7, 9));

        System.out.print(findMinimumMeetingRooms(intervals));
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Meeting(6, 7));
        intervals.add(new Meeting(2, 4));
        intervals.add(new Meeting(8, 12));

        System.out.print(findMinimumMeetingRooms(intervals));
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Meeting(1, 4));
        intervals.add(new Meeting(2, 3));
        intervals.add(new Meeting(3, 6));

        System.out.print(findMinimumMeetingRooms(intervals));
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Meeting(4, 5));
        intervals.add(new Meeting(2, 3));
        intervals.add(new Meeting(2, 4));
        intervals.add(new Meeting(3, 5));

        System.out.print(findMinimumMeetingRooms(intervals));

    }

    public static int findMinimumMeetingRooms(List<Meeting> intervals) {

        if (intervals.isEmpty())
            return 0;

        if (intervals.size() == 1)
            return 1;

        List<Integer> ends = intervals.stream().map(a -> a.end).collect(Collectors.toList());
        ends.sort((a, b) -> a - b);

        List<Integer> starts = intervals.stream().map(a -> a.start).collect(Collectors.toList());
        starts.sort((a, b) -> (a - b));

        int result = 0;

        int j = 0;
        for (int i = 0; i < intervals.size(); i++) {

            if (starts.get(i) < ends.get(j))
                result++;
            else
                j++;

        }

        return result;

    }

}
