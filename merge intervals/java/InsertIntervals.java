import java.util.*;

public class InsertIntervals {

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

        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(8, 12));

        System.out.print("Merged intervals: ");
        System.out.print("[ ");
        for (Interval interval : insertIntervals(intervals, new Interval(4, 6)))
            interval.printInterval();

        System.out.print(" ]");
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(5, 7));
        intervals.add(new Interval(8, 12));

        System.out.print("Merged intervals: ");
        System.out.print("[ ");
        for (Interval interval : insertIntervals(intervals, new Interval(4, 10)))
            interval.printInterval();

        System.out.print(" ]");
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Interval(2, 3));
        intervals.add(new Interval(5, 7));

        System.out.print("Merged intervals: ");
        System.out.print("[ ");
        for (Interval interval : insertIntervals(intervals, new Interval(1, 4)))
            interval.printInterval();

        System.out.print(" ]");

    }

    public static List<Interval> insertIntervals(List<Interval> intervals, Interval newInterval) {

        // Linked list has faster inserts than array lists
        List<Interval> result = new LinkedList<>();
        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {

            result.add(intervals.get(i));
            i++;

        }

        int start = newInterval.start;
        int end = newInterval.end;

        while (i < intervals.size() && intervals.get(i).start <= end) {

            // overlapping intervals, begin next iteration with new interval
            end = Math.max(end, intervals.get(i).end);
            i++;

        }

        // add merged interval
        result.add(new Interval(start, end));

        while (i < intervals.size()) {
            result.add(intervals.get(i));
            i++;
        }

        return result;

    }

}
