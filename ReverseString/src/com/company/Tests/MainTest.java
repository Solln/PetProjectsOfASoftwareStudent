package com.company.Tests;


import com.company.Main.Main;
import org.junit.Assert;

public class MainTest {

    Main main = new Main();


    @org.junit.Test
    public void testReverseString() throws Exception {

        Assert.assertEquals("olleH", Main.reverseString("Hello"));

    }
}