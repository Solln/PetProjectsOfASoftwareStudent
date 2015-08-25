package com.company.Test;

import com.company.Main.Main;
import junit.framework.Assert;

public class MainTest {

    Main main = new Main();


    @org.junit.Test
    public void testPalindromeCheckerTrue() throws Exception {

        Assert.assertTrue(main.isPalindrome(("hannah").toCharArray()));

    }

    @org.junit.Test
    public void testPalindromeCheckerFalse() throws Exception {

        Assert.assertFalse(main.isPalindrome(("hnnah").toCharArray()));

    }



}