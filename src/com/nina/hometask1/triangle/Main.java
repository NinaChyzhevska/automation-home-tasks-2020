package com.nina.hometask1.triangle;

public class Main {
    public static void main(String[] args) {
        Point firstVertex = new Point(-2, 7);
        Point secondVertex = new Point(5, 7);
        Point thirdVertex = new Point(13, 6);

        Triangle triangle = new Triangle(firstVertex, secondVertex, thirdVertex);
        System.out.println("The area is " + triangle.getArea());
    }
}
