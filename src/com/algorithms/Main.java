package com.algorithms;

import com.algorithms.challenges.Anagram;
import com.algorithms.challenges.MultiplyWithoutTimes;
import com.algorithms.challenges.RepeatedString;
import com.algorithms.sort.BubbleSort;

public class Main {

    public static void main(String[] args) {
	    repeatedString();
        //isAnagram();
        //diagonalDiff();
        //bubbleSort();
    }


    public static void repeatedString(){
        RepeatedString repString = new RepeatedString();
        System.out.println(repString.repeatedString("abc",10));
    }

    public static void isAnagram(){
        Anagram anagram = new Anagram();
        anagram.isAnagram("anagram","margana");
    }

    public static void bubbleSort(){
        BubbleSort bs = new BubbleSort();
        int [] arr = {10,5,30,2,1,8,6,4,3};
        bs.bubbleSort(arr);
    }

    public static void multiplyWithoutTimes() {
        MultiplyWithoutTimes times = new MultiplyWithoutTimes();

        int result = 0;
        result = times.initSum(6, 4);
        System.out.println(result);

        result = times.initSum(3, 0);
        System.out.println(result);

        result = times.initSum(-5, 3);
        System.out.println(result);

        result = times.initSum(-6, -6);
        System.out.println(result);
    }
}
