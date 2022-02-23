package com.company.solid.liskovsubstitution.solution;




public class Square extends Shape {

    //refactored the behaviour of a square to be that of a ""
    @Override
    public int calculateArea(int width,int height){
        return width * width;
    }



}
