package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestFindWord {
    private static FindWord findword;
    @BeforeClass
    public static void setup(){
        findword = new FindWord();
    }
    @AfterClass
    public static void Teardown(){
        findword = null;
    }
    @Test
    public void testfindWord(){
        assertEquals("Word Harry is not found","is Harry here ? True",findword.find("This is Harry."));
        assertEquals("Word Henry is not found","is Harry here ? False",findword.find("this is Henry"));
        assertEquals("Word Harry is not found  ","is Harry here ? True",findword.find("this is harry"));
        assertEquals("Word Henry is not found","is Harry here ? False",findword.find("this is harold"));
    }
}
