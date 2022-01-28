package com.algorithms.challenges;

import java.util.Arrays;

/** This class is not ready ready **/
public class DiagonalDifference {

    /*
    *  Given a square matrix, calculate the absolute difference between the sums of its diagonals.
    *  For example, the square matrix
    *  is shown below:
    *  1 2 3
    *  4 5 6
    *  9 8 9
    *  The left to right diagonal: 1+5+9=15
    *  The right to left diagonal: 3+5+9=17
    *  Their absolute difference is |15-17|=2
    * */

    public void diagonalDifference(){
        int[][] matrix = {{1,2,3},{4,5,6},{9,8,9}};
        int leftToRight=0;
        int rightToLeft=0;
        int result=0;
        //fixed size for a square matrix 3x3 needs to be calculed
        for (int i=0; i<3; i++){
            leftToRight=leftToRight+Math.abs(matrix[i][i]);
        }
        for (int i=2; i>=0; i--){
            rightToLeft=rightToLeft+Math.abs(matrix[i][i]);
        }
        result=leftToRight-rightToLeft;
        System.out.println(result);
    }

    public int getMatrixSize(int[][] matrix){

        return 0;
    }
    // test matrix, new might be build during runtime
    public int[][] buildMatrix(){
        int[][] myMatrix={{1,2,3},{4,5,6},{9,8,9}};
//        myMatrix[0][0] = 1;
//        myMatrix[0][1] = 2;
//        myMatrix[0][2] = 3;
//        myMatrix[1][0] = 4;
//        myMatrix[1][1] = 5;
//        myMatrix[1][2] = 6;
//        myMatrix[2][0] = 9;
//        myMatrix[2][1] = 8;
//        myMatrix[2][2] = 9;
        return myMatrix;
    }
}
