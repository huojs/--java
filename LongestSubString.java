package com.util;

/**
 * @author jun
 * 
 * Date：2016年10月26日 下午9:29:55
 */
public class LongestSubString {
	public static void main(String[] args) {
		String s0 = "";
		String s1 = "abcabcbb";
		String s2 = "bbbb";
		String s3 = "abcabcbbabcabcdbabcabcbbabcabcbb";
		String s4 = "abcdeabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb"
				+ "abcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbbabcabcbbabcabcdbabcabcbbabcabcbb";
		System.out.println(lengthOfLongestSubString(s0));
		System.out.println(lengthOfLongestSubString(s1));
		System.out.println(lengthOfLongestSubString(s2));
		System.out.println(lengthOfLongestSubString(s3));
		System.out.println(lengthOfLongestSubString(s4));
	}
	
	public static int lengthOfLongestSubString(String s){
		int strLength = s.length();
		int maxLength = -1;
		int start = 0;
		for(int i = 1;i < strLength;i++){
			char temp = s.charAt(i);
			for(int j = i;j > start ;j--){
				if(s.charAt(j-1) == temp){
					maxLength = (maxLength > (i-start))?maxLength:(i-start);
					start = j;
				}
			}
		}
		
		maxLength = (maxLength>(strLength-start))?maxLength :(strLength-start);
		return maxLength;
		
	}
}
