package com.algorithms.challenges;

import java.util.Collection;
import java.util.HashMap;

/** This class is ready **/

public class Anagram {

    /**
     * Two strings, a and b, are called anagrams if they contain all the same characters in the same frequencies.
     * For this challenge, the test is not case-sensitive.
     * For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
     *
     * Sample input:
     * anagram
     * margana
     * */


    // my thoughts
    // hashmap  key = char,value = count int
    // but we may need to
    // check if size is the same for both inputs if not return false!
    // order does not care, asuming chars
    // to char arr iterate and if exists increment the count


    public void isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()){
            System.out.println("false");
            return;
        }
        System.out.println(buildMaps(s1,s2));
    }

    public boolean buildMaps(String s1, String s2){
        char[] firstInput= s1.toCharArray();
        char[] secondInput = s2.toCharArray();

        int currentValue;
        HashMap<Character,Integer> myFirstMap = new HashMap<>();
        HashMap<Character,Integer> mySecondMap = new HashMap<>();

        for (int i=0; i < s1.length(); i++){
            if(!myFirstMap.containsKey(firstInput[i])) myFirstMap.put((firstInput[i]), 1);
            else myFirstMap.put(firstInput[i], getCurrentValue(myFirstMap,firstInput[i]));

            if(!mySecondMap.containsKey(secondInput[i]))mySecondMap.put((secondInput[i]), 1);
            else mySecondMap.put(secondInput[i], getCurrentValue(mySecondMap,secondInput[i]));

        }
        return myFirstMap.equals(mySecondMap);
    }

    public int getCurrentValue(HashMap<Character,Integer> map, char key){
        int currentValue=0;
        currentValue=map.get(key);
        return (currentValue+1);
    }
}
