package com.sil.java.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void testMyMethod(){
        String str = "Hello";
        assertEquals("Hello", str);
    }
}
