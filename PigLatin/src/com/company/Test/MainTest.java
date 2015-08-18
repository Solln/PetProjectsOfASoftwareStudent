package com.company.Test;


import com.company.Main.Main;
import junit.framework.Assert;

public class MainTest {

    Main main = new Main();

    @org.junit.Test
    public void testExtractFirstLetter() throws Exception {
        Assert.assertEquals(main.extractFirstLetter("hello"),"h");
    }

    @org.junit.Test
    public void testAddAy() throws Exception {
        Assert.assertEquals(main.addAy("h"),"hay");
    }

    @org.junit.Test
    public void testRemoveFirstLetter() throws Exception {
        Assert.assertEquals(main.removeFirstLetter("hello"),"ello");
    }

    @org.junit.Test
    public void testCreatePigLatinWord() throws Exception {

        Assert.assertEquals(main.createPigLatinWord("hello"), "ello-hay");

    }
}