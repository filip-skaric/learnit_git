package com.itbulls.fskaric;

import java.util.Arrays;

/**
 * Hello world application
 * 
 * @author Filip Skaric
 */
public class HelloWorld {

	/**
	 * The entry point to the program
	 * @param args input argument
	 * <br/>See the <a href="{@docRoot}/help-doc.html">Copyright</a>.
	 * @see <a href="{@docRoot}/help-doc.html">Copyright</a>.
	 */
	public static void main(String[] args) {

		System.out.println("Hello world");
		int [] arr = {1, 2, 6, 4};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
