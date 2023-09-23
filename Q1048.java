/*  Q 1048 : Longest String Chain
    Difficulty : Medium
    Problem Statement : You are given an array of words where each word consists of lowercase English letters.
                        wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.
                        For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
                        A word chain is a sequence of words [word1, word2, ..., wordk] with k >= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
                        Return the length of the longest possible word chain with words chosen from the given list of words.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q1048 {

    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        System.out.println(longestStrChain(words));
    }
    public static int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)-> a.length()-b.length());
        Map<String,Integer> map = new HashMap<>();
        int ans=0;
        for(String word : words)
        {
            int longest=0;
            for(int i=0;i<word.length();i++)
            {
                StringBuilder sub = new StringBuilder(word);
                sub.deleteCharAt(i);
                String subStr = sub.toString();
                longest = Math.max(longest,map.getOrDefault(subStr,0)+1);
            }
            map.put(word,longest);
            ans = Math.max(ans,longest);
        }
        return ans;
    }
}