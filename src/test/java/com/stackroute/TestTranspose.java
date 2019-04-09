package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestTranspose {
    private static StringTranspose reverse;
    @BeforeClass
    public static void setup(){
        reverse = new StringTranspose();
    }
    @AfterClass
    public static void Teardown(){
        reverse = null;
    }
    @Test
    public void testtranspose(){
        assertEquals("It is not transposed","a kciuq nworb xof spmuj revo eht yzal god",reverse.transpose("a quick brown fox jumps over the lazy dog"));
        assertEquals("It is not transposed","siht gnirts si desopsnart",reverse.transpose("this string is transposed"));
        assertEquals("It is not transposed","siht noitcnuf si gnikrow",reverse.transpose("this function is working"));
    }
    @Test
    public void transposeFailure(){
        assertNotNull("siht noitcnuf si gnikrow",reverse.transpose("this function is working"));
    }
}
