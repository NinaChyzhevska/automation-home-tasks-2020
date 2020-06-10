package com.nina.hometask2;

public class Area extends Shape {

    @Override
    public void rectangleArea(double length, double breadth) {
        System.out.println("The area of the rectangle is " + length * breadth);
    }

    @Override
    public void squareArea(double side) {
        System.out.println("The area of the square is " + side * side);
    }

    @Override
    public void circleArea(double radius) {
        System.out.println("The area of the circle is  " + Math.PI * radius * radius);
    }
}
