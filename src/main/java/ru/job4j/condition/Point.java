package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double d = first + second;
        double rsl = Math.sqrt(d);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 4, 3, 5);
        System.out.println("result (1, 4) to (3, 5) " + result);
    }
}
