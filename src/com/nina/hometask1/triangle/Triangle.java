package com.nina.hometask1.triangle;

public class Triangle {
    private Point firstVertex;
    private Point secondVertex;
    private Point thirdVertex;

    public Triangle(Point firstVertex, Point secondVertex, Point thirdVertex) {
        validatePoints(firstVertex, secondVertex, thirdVertex);
        this.firstVertex = firstVertex;
        this.secondVertex = secondVertex;
        this.thirdVertex = thirdVertex;
    }

    private void validatePoints(Point firstVertex, Point secondVertex, Point thirdVertex) {
        if (firstVertex == null || secondVertex == null || thirdVertex == null) {
            throw new IllegalArgumentException("Vertexes shouldn't be null");
        }

        if (firstVertex.equals(secondVertex) || secondVertex.equals(thirdVertex) || thirdVertex.equals(firstVertex)) {
            throw new IllegalArgumentException("Some vertexes are the same. That's why it won't be a triangle. " +
                    "Please, change your data");
        }

        if (firstVertex.isOnTheSameHorizontalLine(secondVertex) && secondVertex.isOnTheSameHorizontalLine(thirdVertex)
                || firstVertex.isOnTheSameVerticalLine(secondVertex) && secondVertex.isOnTheSameVerticalLine(thirdVertex)) {
            throw new IllegalArgumentException("Vertexes lay on the one line. That's why it won't be a triangle. " +
                    "Please, change your data");
        }
    }

    private double computeFirstSide() {
        return firstVertex.computeDistanceTo(secondVertex);
    }

    private double computeSecondSide() {
        return secondVertex.computeDistanceTo(thirdVertex);
    }

    private double computeThirdSide() {
        return thirdVertex.computeDistanceTo(firstVertex);
    }

    public double getPerimeter() {
        return computeFirstSide() + computeSecondSide() + computeThirdSide();
    }

    public double getArea() {
        double perimeter = getPerimeter();

        return Math.sqrt(perimeter * (perimeter - computeFirstSide()) * (perimeter - computeSecondSide())
                * (perimeter - computeThirdSide()));
    }
}
