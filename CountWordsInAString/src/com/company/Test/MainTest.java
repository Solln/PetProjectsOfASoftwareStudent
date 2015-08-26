package com.company.Test;


import com.company.Main.Main;
import org.junit.Assert;

public class MainTest {

Main main = new Main();

    @org.junit.Test
    public void testCountWords() throws Exception {

        Assert.assertEquals(5, main.countWords("One Two Three Four Five"));

    }
}