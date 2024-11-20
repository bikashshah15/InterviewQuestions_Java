package com.practise.interviewquestions.questions;

import java.util.HashMap;
import java.util.Map;

public class AreAnagrams {
    public static boolean areAnagrams(String s1, String s2){

        s1 = s1.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s1.length() != s2.length()){
            return false;
        }

        Map<Character,Integer> map = new HashMap<>();

        for (char ch: s1.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch: s2.toCharArray()) {
            if(!map.containsKey(ch))
                return false;
            else
                map.put(ch,map.get(ch)-1);
        }
        for(int count : map.values()){
            if(count != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(areAnagrams( "listen",  "silent"));
        System.out.println(areAnagrams( "hello",  "world"));
        System.out.println(areAnagrams( "Anagram",  "Nag a ram"));
    }
}
