package com.xiehang.miaosha.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void longestPalindrome() {
        String str = longestPalindromeHelper("abaaaba");
        System.out.println(str);
    }

    public String longestPalindromeHelper(String s) {
        if (s.length() == 0) return "";

        int maxStart = 0;
        int maxEnd = 0;

        boolean[][] dp = new boolean[s.length()][s.length()];

        //making everything below the diagonal as true
        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < i; j++) {
                dp[i][j] = true;
            }

        int maxLength = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            dp[i][i] = true;   //diagonal as true
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1] == true) {
                    dp[i][j] = true;
                    if (maxLength < j - i) {
                        maxLength = j - i;
                        maxStart = i;
                        maxEnd = j;
                    }
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}