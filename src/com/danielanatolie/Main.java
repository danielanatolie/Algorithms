package com.danielanatolie;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Design testClass = new Design();
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.add(2);
        myArray.add(5);
        myArray.add(-7);
        myArray.add(1);
        myArray.add(1);
        myArray.add(5);
        System.out.println(testClass.maxset(myArray));
    }
}
