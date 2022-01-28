package com.algorithms.challenges;


/** This class is ready **/
public class RepeatedString {

    /**
    * From HackerRank
    * There is a string, s, of lowercase English letters that is repeated infinitely many times.
    * Given an integer, n , find and print the number of letter a's in the first letters of the infinite string.
    * Example
    * The substring we consider is abcabcabcac, the first characters of the infinite string.
    * There are 4 occurrences of a in the substring.
    *
    * Constraints:
    * s <= 100 as input
    * n < n^12
    * */


    /*
    *   Main method that performs the repeatedString algorithm
    *   @param s string to find a pattern's
    *   @param n number of the string to be cut
    *   @return long number of a's occurrences
    * */
    public long repeatedString(String s, long n){
        //we need to repeat the works X times to fill the amount!
        if (! isFilled(s.length(), n)){
            String builder = repeater(s,n);
            return validator(builder,n);
        }
        return validator(s,n);
    }

    /*
    * Will count the number of repeated a words in a given string
    *   @param s string to find a pattern's
    *   @param n number of the string to be cut
    *   @return long number of a's occurrences
    *
    * */
    public long validator(String s, long n){
        char[] arr = s.toCharArray();
        int counter=0;
        for (int i=0; i <= n; i++ ) {
            if (arr[i] == 'a') counter++;
        }
        return counter;
    }

    /*
    * Check if the length of the string is greater than the given number
    * @return bool true if the string length is greater than the limit number
    * */
    public boolean isFilled(int stringLength, long number){
        long sLength = stringLength;
        if (sLength > number) return true; return false;
    }

    /*
     * Will add the string the times needed to fill the n value,
     * only needed when isFilled method returns false
     * @return String crafted string with the given input
     * */
    public String repeater(String s, long n){
        StringBuilder builder = new StringBuilder();
        builder.append(s);
        while(builder.length() < n ){
            builder.append(s);

        }
        return String.valueOf(builder);
    }
}
