package com.gygame.solu;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author jun
 * 
 * Date：2016年10月26日 下午10:15:58
 */
public class LongestSubStringTest {

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.gygame.solu.LongestSubString#lengthOfLongestSubString(java.lang.String)}.
	 */
	@Test
	public void testLengthOfLongestSubString() {
		assertEquals(0,LongestSubString.lengthOfLongestSubString(""));
	}
	
	@Test
	public void testLengthOfLongestSubString2(){
		assertEquals(1,LongestSubString.lengthOfLongestSubString("bbbbb"));
	}

	@Test
	public void testLengthOfLongestSubString3(){
		assertEquals(3,LongestSubString.lengthOfLongestSubString("abcabcbb"));
	}
	
	@Test
	public void testLengthOfLongestSubString4(){
		assertEquals(5,LongestSubString.lengthOfLongestSubString("abcabcdeabcabcdeabcabcdeabcabcdeabcabcde"));
	}
	
	@Test
	public void testLengthOfLongestSubString5(){
		assertEquals(5,LongestSubString.lengthOfLongestSubString("abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"
				+ "abcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcdeabcabcde"));
	}
}
