package com.algorithms.challenges;

/** This class is ready **/

//** Muliply two numbers without using times **/
public class MultiplyWithoutTimes {

    public int initSum(int a, int b) {
        if (isZero(a,b)) {
            return 0;
        }
        int negatives = checkNegatives(a,b);
        return doMath(a,b,negatives);
    }


    public int checkNegatives(int a, int b) {
        if (a >= 0 && b >= 0) {
            return 0;
        }else if (a < 0 && b < 0) {
            return 2;
        }
        return 1;
    }


    public boolean isZero(int a, int b) {
        if (a == 0 || b == 0 ) {
            return true;
        }
        return false;
    }

    public int doMath(int a, int b, int negatives) {
        int result =0;
        for (int i =1 ; i < Math.abs(a); i++) {
            result = result + Math.abs(b);
        }

        if (negatives ==1) {
            return result = (~(result - 1));
        }
        return result;
    }


}
