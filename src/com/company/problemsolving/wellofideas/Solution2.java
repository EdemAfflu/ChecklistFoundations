package com.company.problemsolving.wellofideas;

public class Solution2 {
    public static String well(String[] x) {
        int count = 0;
        for(int i = 0; i <= x.length-1; i++){
            if(x[i].equals("good")){
                count++;
            }
        }
        if(count > 0 && count < 3){
            return "Publish!";
        } else if(count > 2){
            return "I smell a series!";
        } else{
            return "Fail!";
        }
    }

}
