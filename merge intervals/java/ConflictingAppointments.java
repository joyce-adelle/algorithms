import java.util.*;

public class ConflictingAppointments {

    /**
     * Intervals
     */
    public static class Interval {
        int start = 0;
        int end = 0;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public void printInterval() {
            System.out.print("[ " + start + ", " + end + " ]");
        }

    }

    public static void main(String[] args) {

        List<Interval> intervals = new ArrayList<>();

        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(2, 5));
        intervals.add(new Interval(7, 9));

        System.out.print(conflictingIntervals(intervals));
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(8, 12));

        System.out.print(conflictingIntervals(intervals));
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Interval(4, 5));
        intervals.add(new Interval(2, 3));
        intervals.add(new Interval(3, 6));

        System.out.print(conflictingIntervals(intervals));

    }

    public static boolean conflictingIntervals(List<Interval> intervals) {

        // sort intervals
        intervals.sort((a, b) -> a.start - b.start);

        for (int i = 1; i < intervals.size(); i++) {

            // if time overlaps then there is conflict
            // Only < as the next appointment can start immediately after the first without conflicting
            if (intervals.get(i).start < intervals.get(i- 1).end)
                return false;

        }

        return true;

    }

}
