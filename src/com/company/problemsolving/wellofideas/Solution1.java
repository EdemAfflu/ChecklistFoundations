package com.company.problemsolving.wellofideas;

//https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java
import java.util.Arrays;
 class Solution1 {

    public static String well(String[] x) {
        // TODO
        int count =(int) Arrays.stream(x).filter(a->a.contains("good")).count();

        switch (count){
            case 0:
                return "Fail!";

            case 1:
            case 2:
                return "Publish!";

            default:
                return "I smell a series!";

        }
    }

}
