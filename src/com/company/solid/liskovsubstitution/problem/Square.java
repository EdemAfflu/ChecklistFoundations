package com.company.solid.liskovsubstitution.problem;

//Parent is Square child is Rectangle hence used that modified behaviour
public class Square extends Rectangle {

//Square is a type of Rectangle
//with the square however the height is always equal to the width
    @Override
    public void setHeight(int height) {
        this.height =height;
        this.width= height;
    }
    @Override
    public void setWidth(int width) {
        this.height =width;
        this.width= width;

    }


}
