package com.company.solid.liskovsubstitution.problem;

public class Rectangle {

    protected int width, height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return  height * width;
    }
}
