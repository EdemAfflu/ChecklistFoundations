package com.company.solid.liskovsubstitution.solution;


public class Execute {
    public static void main(String[] args) {
        Shape square = new Square();
        square.calculateArea(square.getHeight(), square.getWidth());

        Shape rect = new Rectangle();
        rect.calculateArea(rect.getHeight(), rect.getWidth());


    }
}
