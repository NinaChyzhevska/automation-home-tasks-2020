package com.nina.hometask1.triangle;

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double computeDistanceTo(Point point) {
        if (point == null) {
            throw new IllegalArgumentException("Point shouldn't be null");
        }

        return Math.sqrt(Math.pow(point.getX() - x, 2) + Math.pow(point.getY() - y, 2));
    }

    public boolean isOnTheSameHorizontalLine(Point point) {
        return x == point.getX();
    }

    public boolean isOnTheSameVerticalLine(Point point) {
        return y == point.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
