package com.company.solid.liskovsubstitution.problem;


public class Execute {

    public static void main(String[] args) {
        Rectangle square= new Square();

        square.setWidth(3);
        square.setHeight(6);
        //3*6 should be 18 if anything but we're getting 36 because it has taking the height as both width and height
        //so we cannot replace it like i thought we could..the behaviour is changed
        System.out.println(square.calculateArea());


    }
}
