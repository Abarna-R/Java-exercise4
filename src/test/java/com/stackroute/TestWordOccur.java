package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static junit.framework.TestCase.assertNull;
import static org.junit.Assert.assertArrayEquals;

public class TestWordOccur {
    private static WordOccurence wordoccur;
    @BeforeClass
    public static void setup(){
        wordoccur= new WordOccurence();
    }
    @AfterClass
    public static void Teardown(){
        wordoccur = null;
    }
    @Test
    public void testwordCount(){
        assertArrayEquals("The occurences of specified word is not matched",new String [] {"4-6","10-12","27-29"},wordoccur.occurence("She sells seashells by the seashore","se"));
    }
    @Test
    public void  wordCountEmpty(){
        assertNull("it returns null if the word does not match",wordoccur.occurence("","se"));
    }
}
