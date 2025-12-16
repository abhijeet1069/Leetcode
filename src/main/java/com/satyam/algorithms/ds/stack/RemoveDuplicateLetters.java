package com.satyam.algorithms.ds.stack;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] ctr = new int[26];
        for(int i = 0; i < s.length(); i++)
            ctr[s.charAt(i)-'a']++;
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < ctr.length; i++){
            if(ctr[i] > 0)
                res.append((char)('a' + i));
        }
        return res.toString();
    }
}
