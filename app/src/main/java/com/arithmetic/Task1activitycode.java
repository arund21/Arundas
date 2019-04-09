package com.arithmetic;

public class Task1activitycode {
    private double radius;

    public Task1activitycode(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double areaCircle()
    {
        double result=(Math.PI*radius*radius);
        return result;
    }

}
