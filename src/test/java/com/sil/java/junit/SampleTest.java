package com.sil.java.junit;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;


public class SampleTest {

    private static Sample sample;

    @BeforeClass
    public static void init(){
        sample = new Sample();
    }

    @Ignore
    public void testMethod1(){
        String result =  sample.method1();
        assertEquals("Hi, How are you?", result);
    }

    @Test
    public void testSum(){
       int result = sample.sum(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testIsValid(){
        boolean result = sample.isValid(10);
        assertTrue(result);
    }

    @Test
    public void testIsNotValid(){
        boolean result = sample.isValid(9);
        assertFalse(result);
    }
}
