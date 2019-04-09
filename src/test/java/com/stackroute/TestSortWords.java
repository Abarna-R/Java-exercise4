package com.stackroute;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



import static org.junit.Assert.assertArrayEquals;

public class TestSortWords {
    private static SortWords sortword;
    @BeforeClass
    public static void setup(){
        sortword = new SortWords();
    }
    @AfterClass
    public static void Teardown(){
        sortword = null;
    }
    @Test
    public void testSortword(){
        assertArrayEquals("Sorting is not done properly",new String[]{"is","this","working"},sortword.sort("This is working"));
        assertArrayEquals("Sorting is not done properly",new String[]{"is","sorted","string","this"},sortword.sort("This string is sorted"));
        assertArrayEquals("Sorting is not done properly",new String[]{"east","in","rises","sun","the"},sortword.sort("Sun rises in the east"));
    }
    @Test
    public void SortwordFailure(){
        Assert.assertNotNull("It is not working",sortword.sort("Sort this sentence"));
    }
}

