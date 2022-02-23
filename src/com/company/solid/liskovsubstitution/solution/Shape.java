package com.company.solid.liskovsubstitution.solution;

public class Shape {
   private int width;
   private int height;


    public int calculateArea(int height, int width) {
        return  height * width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
