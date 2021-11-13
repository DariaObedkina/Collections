import java.util.Comparator;
import java.util.Objects;

public class Point implements Comparable<Point> {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + String.format("%.2f", x) + ", y = " + String.format("%.2f", y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


    @Override
    public int compareTo(Point p) {
        if (this.x > p.x) {
            return 1;
        } else if (this.x == p.x) {
            return 0;
        } else {
            return -1;
        }
    }

    public static Comparator<Point> compareByX = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.x > p2.x) {
                return 1;
            } else if (p1.x == p2.x) {
                return 0;
            } else {
                return -1;
            }
        }
    };

    public static Comparator<Point> compareByY = new Comparator<Point>() {
        @Override
        public int compare(Point p1, Point p2) {
            if (p1.y > p2.y) {
                return 1;
            } else if (p1.y == p2.y) {
                return 0;
            } else {
                return -1;
            }
        }
    };
}

