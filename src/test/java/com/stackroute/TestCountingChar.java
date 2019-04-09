package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
public class TestCountingChar {

    private static CountingChar counting;
    @BeforeClass
    public static void setup(){
        counting = new CountingChar();
    }
    @AfterClass
    public static  void Teardown(){
        counting=null;
    }
    @Test
    public void testCount(){
        assertEquals("It is not the correct count",15,counting.count("Java is java again java again count number of occurrence of a in the given Again Java","a"));
        assertEquals("It is not the correct count",5,counting.count("Java is java again Character again java again count number of occurrence of a in the given Java","v"));
        assertEquals("It is not the correct count",0,counting.count("","c"));

    }
    @Test
    public void testCountFailure(){
        assertNotNull("It is a null value",counting.count("Abarna","a"));
    }

}
