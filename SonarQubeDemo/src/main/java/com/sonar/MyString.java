package com.sonar;
/**
 * 
 * @author VISHAL
 * String handling operations
 */
public class MyString {
	/**
	 * Private Constructor
	 */
	private MyString() {

	}

	/**
	 * Reverse String
	 * @param s
	 * @return
	 */
	public static String reverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}
}