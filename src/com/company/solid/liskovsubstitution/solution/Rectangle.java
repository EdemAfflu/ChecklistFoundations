package com.company.solid.liskovsubstitution.solution;

public class Rectangle extends Shape{


    @Override
    public int calculateArea(int width,int height) {
        return  (width * height);
    }

}
