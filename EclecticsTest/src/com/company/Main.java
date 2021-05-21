package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int sum [] = {3, 5, -4, 8, 11, 1, -1, 6};

        int targetSum = 10;

        int arrLength = sum.length;

        if (twoElements(sum, arrLength, targetSum)){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }

    static boolean twoElements(int One [],int arr_length, int sum){

        int a,b;

        //sorting the elements
        Arrays.sort(One);

        //look for the 2 elements in the sorted array
        a = 0;
        b = arr_length - 1;

        //loop through elements
        while (a < b){
            if (One[a] + One[b] == sum){
                int valueA = One[a];
                int valueB = One[b];
                int [] sumArray = {valueA,valueB};
                System.out.println(Arrays.toString(sumArray));
                return true;
            }

            else if(One[a] + One[b] < sum)
                a++;
            else
                b--;
        }
        return false;
    }
}
