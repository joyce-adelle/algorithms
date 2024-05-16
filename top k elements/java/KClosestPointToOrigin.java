import java.util.*;

public class KClosestPointToOrigin {

    public static void main(String[] args) {

        System.out.println(getKClosestPoint(new Point[] {
                new Point(1, 2), new Point(1, 3)
        }, 1));
        System.out.println(getKClosestPoint(new Point[] {
                new Point(1, 3), new Point(3, 4), new Point(2, -1)
        }, 2));

    }

    public static List<Point> getKClosestPoint(Point[] points, int k) {

        PriorityQueue<Point> heap = new PriorityQueue<>((a, b) -> b.distanceFromOrigin() - a.distanceFromOrigin());

        for (int i = 0; i < k; i++)
            heap.offer(points[i]);

        for (int i = k; i < points.length; i++) {
            Point point = points[i];
            if (point.distanceFromOrigin() < heap.peek().distanceFromOrigin()) {
                heap.poll();
                heap.offer(point);
            }
        }

        return heap.stream().toList();

    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFromOrigin() {
        return (x * x) + (y * y);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }

}
