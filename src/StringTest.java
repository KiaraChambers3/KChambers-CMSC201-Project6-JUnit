/**
* Class: CMSC201
* Instructor: Dr. Grinberg
* Description: This is a JUnit class that tests the string class's lenght, charAt, substring, and indexOf methods. 
* Due: 12/16/2024
* I pledge that I have completed the programming assignment independently.
  I have not copied the code from a student or any source.
  I have not given my code to any student.
  Print your Name here: Kiara Chambers
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/** This class tests the String class*/
public class StringTest {

    /**Tests length method*/
    @Test
    public void testLength() {
        String emptyString = "";
        assertEquals(0, emptyString.length());
    }
    
    /**Tests charAt method*/
    @Test
    public void testCharAt() {
    	String charString = "Canary";
    	assertEquals('C', charString.charAt(0));
    }
    
    /**Tests substring method*/
    @Test
    public void testSubstring() {
        String subStr = "blue bird";
        String result = subStr.substring(5);
        assertEquals("bird",result);
    }
    
    /**Tests indexOf method*/
    @Test
    public void testIndexOf() {
    	String indexStr = "Parakeet";
    	assertEquals(2,indexStr.indexOf('r'));
    }

    
}
