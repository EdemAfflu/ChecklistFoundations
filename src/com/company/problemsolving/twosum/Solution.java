package com.company.problemsolving.twosum;

 class Solution
{
    //https://www.codewars.com/kata/52c31f8e6605bcc646000082/train/java
    //this way has two loops however
    //searching and array is O(n) so having 2 fools loops makes it O(n^2) which is not the optimum solution we want to get
    public  int[] twoSum(int[] numbers, int target)
    {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

