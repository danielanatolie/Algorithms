package com.danielanatolie;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by DanLam on 7/29/16.
 */
public class Design {

    // MAXSET
    // Will get the maximum non-negative sub-array sum from given array
    // i) if the two subarrays have the same sum, return the one with more integers
    // ii) if the two subarrays have the same amount of integers and sum, return the one with the smallest starting integer
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> maxset = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        maxset.add(0);
        for(int i=0; i<a.size(); i++) {

            if(a.get(i) > 0) {
                temp.add(a.get(i));
                if(sumArray(temp) == sumArray(maxset)) {
                    if(maxset.size() < temp.size()) {
                        maxset = temp;
                    } else if(maxset.get(0) < temp.get(0)) {
                        maxset = temp;
                    }
                }
                if(sumArray(temp) > sumArray(maxset)) {
                    maxset = temp;
                }
            } else {
                temp = new ArrayList<Integer>(); // clear won't work because maxset = temp will continousuly update maxset items from temp
            }
        }


        return maxset;
    }

    // SUMARRAY
    // Gets the sum of the all the integers in an array
    public int sumArray(ArrayList<Integer> a) {
        int sum=0;
        for(int i=0; i<a.size(); i++) {
            sum += a.get(i);
        }
        return sum;
    }

}
