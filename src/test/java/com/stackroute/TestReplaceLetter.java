package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class TestReplaceLetter {
    private static ReplaceLetter replaceletter;
    @BeforeClass
    public static void  setup(){
        replaceletter =new ReplaceLetter();
    }
    @AfterClass
    public static void Teardown(){
        replaceletter = null;
    }
    @Test
    public void replaceletter(){
        assertEquals("Specified letters are not replaced","faity fry",replaceletter.replace("daily dry"));
        assertEquals("Specified letters are not replaced","faity fate",replaceletter.replace("daily date"));
    }
    @Test
    public void replaceletterFailure(){
        assertNotNull("This is  a null value",replaceletter.replace("daily dry"));
    }
}
