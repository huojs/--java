package com.gygame.solu;

/**
 * @author jun
 * 
 * Date：2016年10月26日 下午10:10:51
 */
public class LongestSubString {
	
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
