package com.example.vvce.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app=new App();
    @Test
    	void testAdd() {
    	assertEquals(25,app.add(20, 5));
    }
    
    @Test
	void testSubtract() {
	assertEquals(25,app.add(20, 5));
    }
    
    
}
