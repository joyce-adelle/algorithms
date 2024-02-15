import java.util.*;

public class MergeIntervals {

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

        System.out.print("Merged intervals: ");
        System.out.print("[ ");
        for (Interval interval : mergeIntervals(intervals))
            interval.printInterval();

        System.out.print(" ]");
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Interval(6, 7));
        intervals.add(new Interval(2, 4));
        intervals.add(new Interval(5, 9));

        System.out.print("Merged intervals: ");
        System.out.print("[ ");
        for (Interval interval : mergeIntervals(intervals))
            interval.printInterval();

        System.out.print(" ]");
        System.out.println();

        intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(3, 5));

        System.out.print("Merged intervals: ");
        System.out.print("[ ");
        for (Interval interval : mergeIntervals(intervals))
            interval.printInterval();

        System.out.print(" ]");

    }

    public static List<Interval> mergeIntervals(List<Interval> intervals) {

        //sort intervals
        intervals.sort((a, b) -> a.start - b.start);

        //Linked list has faster inserts than array lists
        List<Interval> result = new LinkedList<>();
        Interval currentA = intervals.get(0);
        int start = currentA.start;
        int end = currentA.end;

        for (int i = 1; i < intervals.size(); i++) {

            Interval intervalB = intervals.get(i);

            //overlapping intervals, begin next iteration with new interval
            if (intervalB.start <= end)
                end = Math.max(end, intervalB.end);
            else {
                //add interval when cannot overlap and continue iteration
                result.add(new Interval(start, end));
                start = intervalB.start;
                end = intervalB.end;
            }

        }

        //add last interval
        result.add(new Interval(start, end));

        return result;

    }

}
